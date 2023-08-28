package com.example.implicitinheritancemapping.enitities;

import org.springframework.beans.factory.annotation.Value;

public class Projection {

    //class based projection
    public static class UsernameOnly {
        private String username;
        public UsernameOnly(String username) {
            this.username = username;
        }
        public String getUsername() {
            return username;
        }
    }

    //interface based projection
    public interface UserSummary {
        String getUsername();
        @Value("#{target.username} #{target.email}")
        String getInfo();
    }

}
