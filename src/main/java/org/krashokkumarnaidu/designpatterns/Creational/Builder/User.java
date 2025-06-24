package org.krashokkumarnaidu.designpatterns.Creational.Builder;

public class User {
    private final String username;
    private final String email;
    private final String address;
    private final String phone;

    private User(UserBuilder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.address = builder.address;
        this.phone = builder.phone;
    }

    public static class UserBuilder {
        private String username;
        private String email;
        private String address;
        private String phone;

        public UserBuilder(String username, String email) {
            this.username = username;
            this.email = email;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

