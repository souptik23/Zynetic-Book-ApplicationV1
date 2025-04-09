package com.souptik.Bookstore_Application_Zynetic.model;

import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "books") // optional, but good to specify
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @Id
    private String id; // MongoDB uses String _id (ObjectId), not Long by default

    @NotBlank(message = "Book name is required")
    @Size(max = 100, message = "name can't exceed 100 char")
    private String name;

    @NotBlank(message = "Author name is required")
    @Size(max = 50, message = "Author name can't exceed 50 char")
    private String author;

    @NotBlank(message = "Price required")
    @Pattern(regexp = "^\\d+(\\.\\d{1,2})?$", message = "bad price format")
    private String price;

    private double rating;

    private String category;

    private String isbn;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @Version
    private Integer version;
}
