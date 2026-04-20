/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase13;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private JwtUtil jwtUtil = new JwtUtil();

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {

        // Validación simple (ejemplo)
        if ("admin".equals(username) && "1234".equals(password)) {
            return jwtUtil.generateToken(username);
        }

        throw new RuntimeException("Credenciales inválidas");
    }
}