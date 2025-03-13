package org.dci.model;

public class Agent implements User {
    private String name;
    private String mail;
    private String password;
    private boolean isAdmin;

    public Agent(String name, String mail, String password, boolean isAdmin) {
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.isAdmin = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }


    @Override
    public void printUser() {
        System.out.println("Name: " + name + "\n" +
                           "Mail: " + mail + "\n" +
                           "Role: Agent\n");
    }
}
