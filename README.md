# DIO Desafio - Modelando o Iphone com UML

## Autor
- [Felipe Figueiredo Bezerra](https://github.com/FigFelipe)

## Desafio proposto

> **Nota:** As **Instruções** de desenvolvimento foram seguidas diretamente do [repositório DIO - Trilha JAVA Básico.](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo)

### Modelagem e Diagramação de um Componente iPhone

[](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo#modelagem-e-diagrama%C3%A7%C3%A3o-de-um-componente-iphone)

Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

#### Contexto

[](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo#contexto)

Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos  `.java`.

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

-   Minutos relevantes: 00:15 até 00:55

### Objetivo

[](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo#objetivo)

1.  Criar um diagrama UML que represente as funcionalidades descritas acima.
2.  Implementar as classes e interfaces correspondentes em Java (Opcional).

#### Funcionalidades a Modelar

[](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo#funcionalidades-a-modelar)

|Funcionalidade|Métodos|
|--|--|
|Reprodutor Musical| `tocar()`, `pausar()`, `selecionarMusica(String musica)` |
|Aparelho Telefônico|`ligar(String numero)`,  `atender()`,  `iniciarCorreioVoz()`|
|Navegador de Internet|`exibirPagina(String url)`,  `adicionarNovaAba()`,  `atualizarPagina()`|


## Resolução do Desafio

> **Nota:** O exercício foi desenvolvido como atividade de aprendizado, podendo conter falhas de interpretação, ou implementação. Portanto, sugestões de correção ou colaboração de terceiros sempre serão bem-vindas.

#### Ambiente de Desenvolvimento

 - **IDE**: IntelliJ IDEA 2024.1.4 (Community Edition)
 - **JDK:** Java SE Development Kit 18.0.2.1

## Modelamento UML sugerida

![Iphone_uml](src/uml/UML%20IPhone%20-%20Desafio%20DIO.JPG)

## Desenvolvimento da Estrutura de Classes

O projeto foi estruturado de modo que:

 1. Foi criado um pacote com nome  `IPhone`, qual representa de modo encapsulado, todas as funções disponíveis pelo telefone, tais como  `Reprodução de Música`,  `Navegação de Internet` e  `Ligações Telefônicas`.
 
 2. Criado um outro pacote  `features`, qual representa todas as Interfaces de serviços existentes no IPhone, através das classes  `AparelhoTelefonico.java`,  `NavegadorInternet.java` e `ReprodutorMusical.java`.
 3. Por fim criado um último pacote  `apps`, que representa todos as aplicações existentes no IPhone.

|Pacote|Classes|Descrição|
|--|--|--|
|IPhone| `IPhoneDevice`|Representa o telefone. Acessa todos os recursos pelo método `main()`.
|Features|`AparelhoTelefonico`,  `NavegadorInternet`,  `ReprodutorMusical`|Organiza as Interfaces de serviços disponíveis.
|Apps|`Chrome`,  `Edge`,  `Opera`, `SoundCloud`,  `Spotfy`,  `YouTube Music`, `eSIM_1`,  `eSIM_2`| Organiza os aplicativos existentes no IPhone.

##  Resultados

 Reprodução de Música:
```markdown
    Tocando musica pelo SoundCloud
    Pausando musica pelo SoundCloud
    Selecionando musica Lamb of God - Black Label no SoundCloud
    Tocando musica pelo Spotfy
    Pausando musica pelo Spotfy
    Selecionando musica Lamb of God - Hourglass no Spotfy
    Tocando musica pelo YouTube Music
    Pausando musica pelo YouTube Music
    Selecionando musica Soufly - Frontlines no YouTube Music
```
Navegação de Internet:
```markdown
Adicionando nova aba no Opera
Atualizando pagina no Opera
Exibindo página google.com no Opera
Adicionando nova aba no Chrome
Atualizando pagina no Chrome
Exibindo página google.com no Chrome
Adicionando nova aba no Edge
Atualizando pagina no Edge
Exibindo página google.com no Edge
```
Ligações Telefônicas:
```markdown
Atendendo ligação pelo eSim1
Iniciando serviço de correio de voz pelo eSim1
Realizando ligação pelo eSim1 para o numero 12345
Atendendo ligação pelo eSim2
Iniciando serviço de correio de voz pelo eSim2
Realizando ligação pelo eSim2 para o numero 54321
```
