package com.souptik.Bookstore_Application_Zynetic.controller;

import com.souptik.Bookstore_Application_Zynetic.model.AuthRequest;
import com.souptik.Bookstore_Application_Zynetic.model.Users;
import com.souptik.Bookstore_Application_Zynetic.repository.UserRepository;
import com.souptik.Bookstore_Application_Zynetic.security.JwtHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtHelper jwtHelper;

    @PostMapping("/signup")
    public ResponseEntity<String> register(@RequestBody Users user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setEnabled(true);
        userRepository.save(user);
        return ResponseEntity.ok("User Registered");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody AuthRequest request) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));

        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String token = jwtHelper.generateToken(userDetails);

        return ResponseEntity.ok(token);
    }

    @GetMapping("/")
    public String greet(){
        return "Hello World";
    }

}
