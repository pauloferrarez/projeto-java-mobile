package br.com.unisagrado.infofarma.service;

import java.util.ArrayList;
import java.util.List;

import br.com.unisagrado.infofarma.model.Orientacao;

public class OrientacaoService {

    public List<Orientacao> findOrientacoes(){
        List<Orientacao> orientacoes = new ArrayList<>();

        orientacoes.add(new Orientacao(
                "Tome a medicação conforme prescrição médica",
                "\t\tBusque auxílio e recomendações de um profissional capacitado em relação " +
                        "ao medicamento que está tomando. " +
                        "\n\t\tSe o médico indicou aquela dose é porque ele sabe que aquilo é necessário. " +
                        "\n\t\tEntão cuide para que o seu familiar ou amigo tome as doses corretas do remédio" +
                        " e não pare o tratamento antes do tempo recomendado."));
        orientacoes.add(new Orientacao(
                "Mantenha a lista dos medicamentos visível",
                "\t\tPara ajudar a pessoa a se lembrar de tomar seus medicamentos direitinho, " +
                        "crie uma lista com os horários e as doses de cada medicamento que deve ser tomado " +
                        "ao longo do dia. " +
                        "\n\t\tCole na porta do guarda-roupa ou na geladeira, por exemplo, " +
                        "que são dois lugares bastante visíveis."));
        orientacoes.add(new Orientacao(
                "Faça o acompanhamento periódico com o médico",
                "\t\tÉ necessário ir ao médico periodicamente para que o profissional verifique " +
                        "se o medicamento está cumprindo seu papel. " +
                        "\n\t\tAlém disso, as visitas a um especialista " +
                        "são importantes para verificar se o idoso está com a saúde nos eixos."));
        orientacoes.add(new Orientacao(
                "Busque orientação profissional sobre efeitos colaterais dos medicamentos",
                "\t\tMedicamentos geralmente causam efeitos colaterais, portanto, converse com " +
                        "profissionais especializados para que eles tirem suas dúvidas. " +
                        "\n\t\tLembre-se que na hora de comprar os medicamentos você precisa de orientação de um farmacêutico. " +
                        "\n\t\tEntão aproveite a oportunidade para saber do profissional acerca do jeito ideal " +
                        "de tomar o medicamento e sobre possíveis riscos colaterais."));
        orientacoes.add(new Orientacao(
                "Evite a automedicação",
                "\t\tA automedicação é muito comum e mesmo pessoas idosas que fazem uso de medicamentos" +
                        " controlados costumam tomar remédio sem orientação profissional. " +
                        "\n\t\tEle não deve tomar um medicamento porque outra pessoa falou que era bom, " +
                        "mesmo que alguém tenha tido o mesmo problema, pois cada caso é um caso. " +
                        "\n\t\tAlém de poder ser ineficiente, a automedicação ainda pode prejudicar a saúde do idoso."));
        orientacoes.add(new Orientacao(
                "Armazene seus medicamentos corretamente",
                "\t\tMantenha o medicamento em sua embalagem original, sempre protegidos de luz, calor e umidade." +
                        "\n\t\tSempre guarde os medicamentos em locais onde crianças e animais não alcancem." +
                        "\n\t\tFique atento aos medicamentos que precisam ser armazenados na " +
                        "geladeira e não os guarde na porta da geladeira."));

        return orientacoes;
    }
}
