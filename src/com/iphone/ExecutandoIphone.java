package com.iphone;

import com.iphone.funcionalidades.Iphone;

public class ExecutandoIphone{

    public static void main(String[] args){

          Iphone iphone = new Iphone();

          System.out.println("");
          System.out.println(" ---------------------------- ");

          // Funcionalidades do Aparelho Telefonico
          iphone.ligar("11 98787 0202");
          iphone.atender();
          iphone.iniciarConversa();
          
          // Funcionalidades do Reprodutor Musical 
          iphone.tocar();;
          iphone.pausar();
          iphone.selecionarMusica("musica-teste");

          // Funcionalidades do Navegador de Internet 
          iphone.exibirPagina("paginas-teste");
          iphone.adicionarNovaAba();
          iphone.atualizarPagina();

          System.out.println(" ---------------------------- ");

    }
    

}