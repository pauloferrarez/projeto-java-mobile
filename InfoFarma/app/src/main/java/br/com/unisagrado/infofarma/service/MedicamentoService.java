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
                "\t\tEfeito anticolinérgico pronunciado. \n\t\t" +
                        "Possui eliminação reduzida entre idosos.\n\t\t" +
                        "Risco de confusão, boca seca, constipação e outros efeitos anticolinérgicos. \n" +
                        "\nAlternativas: \n\n" +
                        " - Soro fisiológico nasal.\n" +
                        " - Anti-histamínico de segunda geração (ex.: loratadina).\n" +
                        " - Corticoesteroide intranasal (ex.: budesonida)."));
        medicamentos.add(new Medicamento(
                medicamentos.size(),
                "Anti-inflamatórios não esteroides",
                "ibuprofeno, cetoprofeno, meloxicam, naproxeno, piroxicam",
                "\t\tRisco pronunciado de sangramento gastrointestinal ou úlcera péptica em grupos de alto risco \n" +
                        "(ex.: idade superior a 75 anos, tomando corticoesteroides, anticoagulantes e/ou agentes antiplaquetários)"));
        medicamentos.add(new Medicamento(
                medicamentos.size(),
                "Antidepressivos tricíclicos",
                "amitriptilina, nortriptilina, imipramina",
                "\t\tEfeito anticolinérgico pronunciado. \n\t\t" +
                        "Causa sedação e hipotensão ortostática. \n\t\t" +
                        "Risco de eventos adversos maior entre idosos com demência, glaucoma de ângulo " +
                        "estreito, disfunções na condução cardíaca e histórico de retenção urinária.\n" +
                        "\nAlternativas: \n\n " +
                        " - Tratamento não farmacológico.\n" +
                        " - Para depressão: inibidores da recaptação de serotonina seletivos " +
                        "(exceto paroxetina e fluoxetina), inibidores da recaptação de " +
                        "serotonina e noradrenalina, bupropiona.\n" +
                        " - Para dor neuropática: inibidores da recaptação de serotonina" +
                        " e noradrenalina, gabapentina, pregabalina."));
        medicamentos.add(new Medicamento(
                medicamentos.size(),
                "Antipsicóticos",
                "Clorpromazina, Clozapina, Flufenazina, Olanzapina, " +
                        "Pimozida, Tioridazina, Trifluoperazina",
                "\t\tOs antipsicóticos devem ser evitados para tratar os problemas" +
                        "comportamentais da demência, pois estão associados a um" +
                        "risco aumentado de AVC e de mortalidade em pacientes com demência"));
        medicamentos.add(new Medicamento(
                medicamentos.size(),
                "Benzodiazepínicos",
                "alprazolam, clonazepam, diazepam",
                "\t\tIdosos possuem sensibilidade aumentada para benzodiazepínicos e redução no seu metabolismo." +
                        "\n\t\tCausam sedação pronunciada, confusão e podem aumentar o risco de déficit cognitivo, " +
                        "delírio, quedas, fraturas, acidentes automotores e exacerbação" +
                        " de disfunção respiratória crônica ou aguda."));
        medicamentos.add(new Medicamento(
                medicamentos.size(),
                "Hipnóticos não benzodiazepínicos",
                "Zolpidem",
                "\t\tEfeitos adversos similares aos benzodiazepínicos " +
                        "(por exemplo: delirium, quedas, fraturas). " +
                        "\n\t\tPequena melhora na latência e duração do sono"));
        medicamentos.add(new Medicamento(
                medicamentos.size(),
                "Relaxantes musculares",
                "Carisoprodol, Ciclobenzaprina, Orfenadrina",
                "\t\tA maioria dos relaxantes musculares" +
                        "é mal tolerada por idosos devido aos efeitos anticolinérgicos, como " +
                        "sedação e consequente risco de fratura. " +
                        "A efetividade em doses toleradas por idosos é questionável."));
        medicamentos.add(new Medicamento(
                medicamentos.size(),
                "Antiparkinsonianos",
                "Levodopa, Triexifenidil, Biperideno",
                "\t\tA depuração de levodopa é reduzido em idosos, que são mais suscetíveis " +
                        "aos efeitos adversos dos fármacos, sobretudo, hipotensão ortostática e confusão. " +
                        "\n\t\tPortanto, os pacientes idosos devem começar com dosagem inicial baixa de " +
                        "levodopa e monitorar cuidadosamente os efeitos adversos. " +
                        "\n\t\tOs pacientes que ficam confusos quando utilizam a levodopa podem também não " +
                        "tolerar os agonistas da dopamina (p. ex., pramipexol, ropinirol). " +
                        "\n\t\tComo idosos com sintomas parkinsonianos também podem ter sintomas cognitivos " +
                        "concomitantes, deve-se evitar os fármacos com efeitos anticolinérgicos."));
        medicamentos.add(new Medicamento(
                medicamentos.size(),
                "Diuréticos",
                "hidroclorotiazida, clortalidona",
                "\t\tPequenas doses desses fármacos podem efetivamente controlar a hipertensão" +
                        " em muitos pacientes idosos e acarretar menos risco que outros diuréticos. " +
                        "\n\t\tAssim, os suplementos de potássio podem ser necessários menos frequentemente." +
                        "\n\t\tOs diuréticos poupadores de potássio devem ser cuidadosamente usados em idosos. " +
                        "\n\t\tO nível de potássio deve ser monitorado com cuidado, principalmente quando " +
                        "o paciente apresenta comprometimento da função renal."));
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
