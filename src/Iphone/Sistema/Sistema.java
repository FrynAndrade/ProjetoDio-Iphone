package Iphone.Sistema;

import Iphone.AparelhoTelefonico.AparelhoTelefonico;
import Iphone.NavegadorInternet.NavegadorInternet;
import Iphone.ReprodutorMusical.ReprodutorMusical;

public class Sistema implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void tocar() {
        System.out.println("TOCANDO A MUSICA");
    }

    public void pausar() {
        System.out.println("PAUSANDO A MUSICA");
    }

    public void selecionarMusica() {
        System.out.println("SELECIONANDO UMA MUSICA");
    }

    public void ligar() {
        System.out.println("LIGANDO...");
    }

    public void atender() {
        System.out.println("ATENDENDO");
    }

    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO O VIVA-VOZ");
    }

    public void exibirPagina() {
        System.out.println("EXIBINDO A PAGINA");
    }

    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO UMA NOVA ABA AO NAVEGADOR");
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PAGINA");
    }
}
