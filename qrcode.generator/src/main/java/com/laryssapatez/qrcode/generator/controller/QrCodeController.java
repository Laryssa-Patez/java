package com.laryssapatez.qrcode.generator.controller;

import com.laryssapatez.qrcode.generator.dto.QrCodeGenerateRequest;
import com.laryssapatez.qrcode.generator.dto.QrCodeGenerateResponse;
import com.laryssapatez.qrcode.generator.service.QrCodeGeneratorService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    private final QrCodeGeneratorService qrCodeGeneratorService;

    public QrCodeController(QrCodeGeneratorService qrCodeGeneratorService) {
        this.qrCodeGeneratorService = qrCodeGeneratorService;
    }

    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> generate(@RequestBody QrCodeGenerateRequest request) {
        try {
            QrCodeGenerateResponse response = this.qrCodeGeneratorService.generateAndUploadQrCode(request.text());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            System.out.println("Error generating QR code: " + e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }
}