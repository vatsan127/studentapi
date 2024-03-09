package srivatsan.studentapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import srivatsan.studentapi.model.Admin;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private Admin admin;

    public AdminController(Admin admin) {
        this.admin = admin;
    }

    @GetMapping("/")
    public ResponseEntity<Admin> getAdminDetails() {
        return ResponseEntity.ok(admin);
    }
}
