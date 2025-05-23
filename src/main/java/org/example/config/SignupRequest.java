// Add to your package structure as needed
package org.example.config;

public class SignupRequest {
    private String nom;
    private String email;
    private String motDePasse;
    private String role; // "ADMIN" or "TRAINER"

    // Getters and setters
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMotDePasse() { return motDePasse; }
    public void setMotDePasse(String motDePasse) { this.motDePasse = motDePasse; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
