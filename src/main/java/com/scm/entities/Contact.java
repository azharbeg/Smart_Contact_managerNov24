package com.scm.entities;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Contact {
        @Id
        private String id;
        private String name;
        private String email;
        private String phoneNumber;
        private String address;
        private String picture;
        @Column(length = 1000)
        private String description;
        private boolean favorite=false;
        private String websiteLink;
        private String linkedInLink;

        private String cloudinaryImagePublicId;


        @ManyToOne
        @JsonIgnore
        private User user;

        // mapping with socialLink
    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
    private List<SocialLink>link = new ArrayList<>();
        


}