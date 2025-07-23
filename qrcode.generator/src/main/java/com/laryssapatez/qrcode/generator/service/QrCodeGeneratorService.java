package com.laryssapatez.qrcode.generator.service;

import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import com.laryssapatez.qrcode.generator.dto.QrCodeGenerateRequest;
import com.laryssapatez.qrcode.generator.dto.QrCodeGenerateResponse;
import com.laryssapatez.qrcode.generator.ports.StoragePort;

import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;

@Service
public class QrCodeGeneratorService {
    private final StoragePort storage;

    public QrCodeGeneratorService(StoragePort storage) {
        this.storage = storage;
    }

    public QrCodeGenerateResponse generateAndUploadQrCode(String text) throws WriterException, IOException {
        //Utilização da lib Google ZXing para gerar QR Code
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, com.google.zxing.BarcodeFormat.QR_CODE, 200, 200);

        ByteArrayOutputStream pngOutputStream = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix, "PNG", pngOutputStream);
        byte[] pngQrCodeData = pngOutputStream.toByteArray();

        String url = storage.uploadFile(pngQrCodeData, UUID.randomUUID().toString(), "image/png");

        return new QrCodeGenerateResponse(url);
    }

}
