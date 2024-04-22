package Iphone;

import Iphone.AparelhoTelefonico.AparelhoTelefonico;
import Iphone.NavegadorInternet.NavegadorInternet;
import Iphone.ReprodutorMusical.ReprodutorMusical;
import Iphone.Sistema.Sistema;

public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical spotify = new Sistema();
        NavegadorInternet google = new Sistema();
        AparelhoTelefonico chamada = new Sistema();

        spotify.tocar();
        spotify.pausar();
        spotify.selecionarMusica();

        google.exibirPagina();
        google.adicionarNovaAba();
        google.atualizarPagina();

        chamada.iniciarCorreioVoz();
        chamada.atender();
        chamada.ligar();

    }
}