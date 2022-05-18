package br.com.unisagrado.infofarma.service;

import java.util.ArrayList;
import java.util.List;

import br.com.unisagrado.infofarma.model.Medicamento;

public class MedicamentoService {

    public List<Medicamento> findMedicamentos(){
        List<Medicamento> medicamentos = new ArrayList<>();

        medicamentos.add(new Medicamento(
                medicamentos.size(),
                "Anti-histamínicos de primeira geração",
                "clorfeniramina, dexclorfeniramina, dimenidrato, hidroxizina, prometazina",
                "Efeito anticolinérgico pronunciado. \n" +
                        "Possui eliminação reduzida entre idosos.\n" +
                        "Risco de confusão, boca seca, constipação e outros efeitos anticolinérgicos. \n" +
                        "\nAlternativas: \n\n" +
                        " - Soro fisiológico nasal.\n" +
                        " - Anti-histamínico de segunda geração (ex.: loratadina).\n" +
                        " - Corticoesteroide intranasal (ex.: budesonida)."));
        medicamentos.add(new Medicamento(
                medicamentos.size(),
                "Anti-inflamatórios não esteroides",
                "ibuprofeno, cetoprofeno, meloxicam, naproxeno, piroxicam",
                "Risco pronunciado de sangramento gastrointestinal ou úlcera péptica em grupos de alto risco \n" +
                        "(ex.: idade superior a 75 anos, tomando corticoesteroides, anticoagulantes e/ou agentes antiplaquetários)"));
        medicamentos.add(new Medicamento(
                medicamentos.size(),
                "Antidepressivos tricíclicos",
                "amitriptilina, nortriptilina, imipramina",
                "Efeito anticolinérgico pronunciado. \n" +
                        "Causa sedação e hipotensão ortostática. \n" +
                        "Risco de eventos adversos maior entre idosos com demência, glaucoma de ângulo estreito, disfunções na condução cardíaca e histórico de retenção urinária.\n" +
                        "\nAlternativas: \n\n " +
                        " - Tratamento não farmacológico.\n" +
                        " - Para depressão: inibidores da recaptação de serotonina seletivos " +
                        "(exceto paroxetina e fluoxetina), inibidores da recaptação de serotonina e noradrenalina, bupropiona.\n" +
                        " - Para dor neuropática: inibidores da recaptação de serotonina e noradrenalina, gabapentina, pregabalina."));
        medicamentos.add(new Medicamento(
                medicamentos.size(),
                "Benzodiazepínicos",
                "alprazolam, clonazepam, diazepam",
                "Idosos possuem sensibilidade aumentada para benzodiazepínicos e redução no seu metabolismo.\n" +
                        "Causam sedação pronunciada, confusão e podem aumentar o risco de déficit cognitivo, delírio, quedas, fraturas, acidentes automotores e exacerbação de disfunção respiratória crônica ou aguda."));
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
                "Codeína",
                "Analgésico",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                        "Vestibulum et ante vitae turpis auctor placerat a vitae libero. Etiam sit amet diam ut nisi dictum commodo. Donec efficitur pretium tellus, sit amet efficitur ante.\n" +
                        "Maecenas ac tortor id purus bibendum sodales non sit amet nulla. Sed nec arcu ultrices, pulvinar elit vitae, iaculis erat.\n" +
                        "Phasellus id augue tempor, dignissim felis vitae, accumsan nulla."));
        return medicamentos;
    }

    public List<Medicamento> findInteracoes(){
        List<Medicamento> interacoes = new ArrayList<>();

        interacoes.add(new Medicamento(
                interacoes.size(),
                "Anti-histamínicos de primeira geração",
                "clorfeniramina, dexclorfeniramina, dimenidrato, hidroxizina, prometazina",
                "Efeito anticolinérgico pronunciado. \n" +
                        "Possui eliminação reduzida entre idosos.\n" +
                        "Risco de confusão, boca seca, constipação e outros efeitos anticolinérgicos. \n" +
                        "\nAlternativas: \n\n" +
                        " - Soro fisiológico nasal.\n" +
                        " - Anti-histamínico de segunda geração (ex.: loratadina).\n" +
                        " - Corticoesteroide intranasal (ex.: budesonida)."));
        interacoes.add(new Medicamento(
                interacoes.size(),
                "Anti-histamínicos de primeira geração",
                "clorfeniramina, dexclorfeniramina, dimenidrato, hidroxizina, prometazina",
                "Efeito anticolinérgico pronunciado. \n" +
                        "Possui eliminação reduzida entre idosos.\n" +
                        "Risco de confusão, boca seca, constipação e outros efeitos anticolinérgicos. \n" +
                        "\nAlternativas: \n\n" +
                        " - Soro fisiológico nasal.\n" +
                        " - Anti-histamínico de segunda geração (ex.: loratadina).\n" +
                        " - Corticoesteroide intranasal (ex.: budesonida)."));
        interacoes.add(new Medicamento(
                interacoes.size(),
                "Anti-histamínicos de primeira geração",
                "clorfeniramina, dexclorfeniramina, dimenidrato, hidroxizina, prometazina",
                "Efeito anticolinérgico pronunciado. \n" +
                        "Possui eliminação reduzida entre idosos.\n" +
                        "Risco de confusão, boca seca, constipação e outros efeitos anticolinérgicos. \n" +
                        "\nAlternativas: \n\n" +
                        " - Soro fisiológico nasal.\n" +
                        " - Anti-histamínico de segunda geração (ex.: loratadina).\n" +
                        " - Corticoesteroide intranasal (ex.: budesonida)."));

        return interacoes;
    }
}
