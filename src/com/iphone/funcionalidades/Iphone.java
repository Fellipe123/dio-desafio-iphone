package com.iphone.funcionalidades;

import com.iphone.contratos.AparelhoTelefone;
import com.iphone.contratos.NavegadorInternet;
import com.iphone.contratos.ReprodutorMusical;

public class Iphone implements AparelhoTelefone, NavegadorInternet, ReprodutorMusical{

     @Override
     public void exibirPagina(String url) {
          System.out.println("Exibindo Pagina " + url);
     }

     @Override
     public void adicionarNovaAba() {
          System.out.println("Adicionando nova Aba");
     }

     @Override
     public void atualizarPagina() {
          System.out.println("Atualizando Pagina");
     }

     @Override
     public void tocar() {
          System.out.println("Tocando");
     }

     @Override
     public void pausar() {
          System.out.println("Pausando");
     }

     @Override
     public void selecionarMusica(String musica) {
          System.out.println("Selecionando musica " + musica);
     }

     @Override
     public void ligar(String numero) {
          System.out.println("Ligando para " + numero);
     }

     @Override
     public void atender() {
          System.out.println("Atendendo");
     }

     @Override
     public void iniciarCorreioVoz() {
          System.out.println("iniciando correio voz");
     }

}