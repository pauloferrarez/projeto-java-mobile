package br.com.unisagrado.infofarma.service;

import java.util.ArrayList;
import java.util.List;

import br.com.unisagrado.infofarma.model.Medicamento;

public class MedicamentoService {

    public List<Medicamento> findAll(){
        List<Medicamento> medicamentos = new ArrayList<>();

        medicamentos.add(new Medicamento(
                medicamentos.size(),
                "Paracetamol",
                "Analgésico",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                        "Vestibulum et ante vitae turpis auctor placerat a vitae libero. Etiam sit amet diam ut nisi dictum commodo. Donec efficitur pretium tellus, sit amet efficitur ante.\n" +
                        "Maecenas ac tortor id purus bibendum sodales non sit amet nulla. Sed nec arcu ultrices, pulvinar elit vitae, iaculis erat.\n" +
                        "Phasellus id augue tempor, dignissim felis vitae, accumsan nulla."));
        medicamentos.add(new Medicamento(
                medicamentos.size(),
                "Dipirona",
                "Analgésico",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                        "Vestibulum et ante vitae turpis auctor placerat a vitae libero. Etiam sit amet diam ut nisi dictum commodo. Donec efficitur pretium tellus, sit amet efficitur ante.\n" +
                        "Maecenas ac tortor id purus bibendum sodales non sit amet nulla. Sed nec arcu ultrices, pulvinar elit vitae, iaculis erat.\n" +
                        "Phasellus id augue tempor, dignissim felis vitae, accumsan nulla."));
        medicamentos.add(new Medicamento(
                medicamentos.size(),
                "Ibuprofeno",
                "Analgésico",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                        "Vestibulum et ante vitae turpis auctor placerat a vitae libero. Etiam sit amet diam ut nisi dictum commodo. Donec efficitur pretium tellus, sit amet efficitur ante.\n" +
                        "Maecenas ac tortor id purus bibendum sodales non sit amet nulla. Sed nec arcu ultrices, pulvinar elit vitae, iaculis erat.\n" +
                        "Phasellus id augue tempor, dignissim felis vitae, accumsan nulla."));
        medicamentos.add(new Medicamento(
                medicamentos.size(),
                "Rivotril",
                "Ansiolítico",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                        "Vestibulum et ante vitae turpis auctor placerat a vitae libero. Etiam sit amet diam ut nisi dictum commodo. Donec efficitur pretium tellus, sit amet efficitur ante.\n" +
                        "Maecenas ac tortor id purus bibendum sodales non sit amet nulla. Sed nec arcu ultrices, pulvinar elit vitae, iaculis erat.\n" +
                        "Phasellus id augue tempor, dignissim felis vitae, accumsan nulla."));
        medicamentos.add(new Medicamento(
                medicamentos.size(),
                "Omeprazol",
                "Sei lá",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                        "Vestibulum et ante vitae turpis auctor placerat a vitae libero. Etiam sit amet diam ut nisi dictum commodo. Donec efficitur pretium tellus, sit amet efficitur ante.\n" +
                        "Maecenas ac tortor id purus bibendum sodales non sit amet nulla. Sed nec arcu ultrices, pulvinar elit vitae, iaculis erat.\n" +
                        "Phasellus id augue tempor, dignissim felis vitae, accumsan nulla."));
        medicamentos.add(new Medicamento(
                medicamentos.size(),
                "Viagra",
                "Vasodilatador",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                        "Vestibulum et ante vitae turpis auctor placerat a vitae libero. Etiam sit amet diam ut nisi dictum commodo. Donec efficitur pretium tellus, sit amet efficitur ante.\n" +
                        "Maecenas ac tortor id purus bibendum sodales non sit amet nulla. Sed nec arcu ultrices, pulvinar elit vitae, iaculis erat.\n" +
                        "Phasellus id augue tempor, dignissim felis vitae, accumsan nulla."));
        medicamentos.add(new Medicamento(
                medicamentos.size(),
                "Codeína",
                "Analgésico",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                        "Vestibulum et ante vitae turpis auctor placerat a vitae libero. Etiam sit amet diam ut nisi dictum commodo. Donec efficitur pretium tellus, sit amet efficitur ante.\n" +
                        "Maecenas ac tortor id purus bibendum sodales non sit amet nulla. Sed nec arcu ultrices, pulvinar elit vitae, iaculis erat.\n" +
                        "Phasellus id augue tempor, dignissim felis vitae, accumsan nulla."));
        medicamentos.add(new Medicamento(
                medicamentos.size(),
                "Paçoca de Bar",
                "uma delícia",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                        "Vestibulum et ante vitae turpis auctor placerat a vitae libero. Etiam sit amet diam ut nisi dictum commodo. Donec efficitur pretium tellus, sit amet efficitur ante.\n" +
                        "Maecenas ac tortor id purus bibendum sodales non sit amet nulla. Sed nec arcu ultrices, pulvinar elit vitae, iaculis erat.\n" +
                        "Phasellus id augue tempor, dignissim felis vitae, accumsan nulla."));

        return medicamentos;
    }

}
