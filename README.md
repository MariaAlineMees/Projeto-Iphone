# 📱 Desafio de POO - iPhone

Este projeto simula um componente de iPhone utilizando os conceitos de Programação Orientada a Objetos (POO) em Java. O objetivo foi representar, via UML e código, três funcionalidades principais:

- Reprodutor Musical
- Aparelho Telefônico
- Navegador na Internet

## 📌 Funcionalidades

### Reprodutor Musical
- `tocar()`
- `pausar()`
- `selecionarMusica(String musica)`

### Aparelho Telefônico
- `ligar(String numero)`
- `atender()`
- `iniciarCorreioVoz()`

### Navegador na Internet
- `exibirPagina(String url)`
- `adicionarNovaAba()`
- `atualizarPagina()`

### Desenvolvido por
- Maria Aline Mees 
- Desafio prático da DIO - Digital Innovation One

## 📊 Diagrama UML

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone ..|> ReprodutorMusical
    iPhone ..|> AparelhoTelefonico
    iPhone ..|> NavegadorInternet


