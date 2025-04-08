package com.souptik.Bookstore_Application_Zynetic.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Changed from int to Long for better compatibility

    @NotBlank(message = "Book name is required")
    @Size(max = 100, message = "Book name cannot exceed 100 characters")
    @Column(nullable = false, length = 100)
    private String name;

    @NotBlank(message = "Author name is required")
    @Size(max = 50, message = "Author name cannot exceed 50 characters")
    @Column(nullable = false, length = 50)
    private String author;

    @NotBlank(message = "Price is required")
    @Pattern(regexp = "^\\d+(\\.\\d{1,2})?$", message = "Invalid price format")
    @Column(nullable = false, length = 10)
    private String price;

    @Column(unique = true)
    private String isbn;  // Added ISBN field

    @CreationTimestamp
    @Column(updatable = false, name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Version
    private Integer version;  // For optimistic locking

    // Builder pattern will handle construction
    // No need for explicit constructors when using @AllArgsConstructor and @NoArgsConstructor
}

