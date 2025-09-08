# das-1-2025-2-b

## Arquiteturade código: Engenharia de software
https://engsoftmoderna.info/cap5.html
https://integrada.minhabiblioteca.com.br/reader/books/9788550816043/pageid/0
https://integrada.minhabiblioteca.com.br/reader/books/9788577800469/pageid/0

https://refactoring.guru/design-patterns

https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/18[%3Bvnd.vst.idref%3Dcap1.xhtml]!/4/2/2/1:0[%2CCAP]

# Aula do dia 31/07/2025 

# Introdução:
Desenvolver software esta relacionado a resolver os problemas, a abstração é uma representação simplificada de uma entidade. Apesar de simplificada, ela nos permite interagir e tirar proveito da entidade abstraída, sem que tenhamos que dominar todos os detalhes envolvidos na sua implementação. 

# Abstração: 
Engenheiro de softwre esta basicamente fazendo a ponte entre o ser humano e seus pensamentos para a maquina e assim vice e versa, desenvolvendo soluções para os problemas que se enfrenta no dia a dia.

# Complexidade - vilão do desenvolvimento de software:
A complexidade é o que caracteriza sistemas modernos de software. Talvez, por isso, (Ousterhout) mencione que a decomposição de um problema em partes independentes é uma questão fundamental, não apenas em Engenharia de Software, mas em toda Ciência da Computação, Fazer a decomposição desta ideia funciona perfeitamente para se entender a rede de forma total e poder se ter uma noção dos passos a ser desenvolvido.

# Projeto orientado a objetos:
Esta relacionada a toda a complexidade no inicio do desenvolvimento de software porem se torna a solução a longo prazo pois facilita a entender o codigo com mais facilidade e ajuda a resolver as questões e problemas de forma mais direta e eficaz. 

# Integridade Conceituão:
"Integridade conceitual é a consideração mais importante no projeto de sistemas. É melhor um sistema omitir algumas funcionalidades e melhorias anômalas, de forma a oferecer um conjunto coerente de ideias, do que oferecer diversas ideias interessantes, mas independentes e descoordenadas."
utilizar os padrões disponiveis no aplicativo utilizado pelo mesmo para facilitar e efetuar um código correto e limpo, aprender framework para manipulação de páginas web ou uma versão diferente do primeiro framework, sistema reserva-se problema usando estrutura de dados x, e outros problemas parecidos utilizando estrutura em y.

# Ocultamento de informação:
# Desenvolvimento em paralelo. Suponha que um sistema X foi implementado por meio de classes C1, C2, …, Cn. Quando essas classes ocultam suas principais informações, fica mais fácil implementá-las em paralelo, por desenvolvedores diferentes. Consequentemente, teremos uma redução no tempo total de implementação do sistema.

# Flexibilidade a mudanças. Por exemplo, suponha que descobrimos que a classe Ci é responsável pelos problemas de desempenho do sistema. Quando detalhes de implementação de Ci são ocultados do resto do sistema, fica mais fácil trocar sua implementação por uma classe Ci', que use estruturas de dados e algoritmos mais eficientes. Essa troca também é mais segura, pois como as classes são independentes, diminui-se o risco de a mudança introduzir bugs em outras classes.

# Facilidade de entendimento. Por exemplo, um novo desenvolvedor contratado pela empresa pode ser alocado para trabalhar em algumas classes apenas. Portanto, ele não precisará entender toda a complexidade do sistema, mas apenas a implementação das classes pelas quais ficou responsável.

No entanto, para se atingir os benefícios acima, classes devem satisfazer à seguinte condição (ou critério): elas devem esconder decisões de projeto que são sujeitas a mudanças. Devemos entender decisão de projeto como qualquer aspecto de projeto da classe, como os requisitos que ela implementa ou os algoritmos e estruturas de dados que serão usados no seu código.

# Aula 04/08/2025 - (Segunda-Feira)

# Coesão:

Toda classe deve implementar uma unica funcionalidade ou serviço, deve ter uma responsabilidade no sistema.

# [Vantagens]:

# Facilita a implementação de uma classe, bem como o seu entendimento e manutenção.
# Facilita a alocação de um único responsável por manter uma classe.
# Facilita o reúso e teste de uma classe, pois é mais simples reusar e testar uma classe coesa do que uma classe com várias responsabilidades.

deve-se haver uma separação de interesse das classes, classe coesa deve ter uma unica responsabilidade,
não se deve ter "mistura" de informações e propositos, cada classe deve ser exatamente voltada para o que foi definida em seu uso, havendo separação de funcionalidades e deveres que devem executar ao serem criados.

# Acoplamento:

# [Acoplamentoestrutural]: entre A e B ocorre quando uma classe A possui uma referência explícita em seu código para uma classe B. Por exemplo, o acoplamento entre Estacionamento e Hashtable é estrutural.

# [Acoplamentoevolutivo(oulógico)] entre A e B ocorre quando mudanças na classe B tendem a se propagar para a classe A. No exemplo mencionado, no qual a classe A depende de um inteiro armazenado em um arquivo interno de B, não existe acoplamento estrutural entre A e B, pois A não declara nenhuma variável do tipo B, mas existe acoplamento evolutivo. Por exemplo, mudanças no formato do arquivo criado por B terão impacto em A.

# [Beck] "quando mudanças em um elemento demandam mudanças em um outro elemento — corresponde à definição de acoplamento evolutivo"

Existe uma conexão entre as duas classes, onde existe uma "dependencia" de um para com o outro.

# SOLID 

Principio de projetos onde pode ser recomendações génericas ou estrategicas, usado não somente para resolver um problema mas assegurar que seja uma solução que possa evoluir, tendo em vista que a maioria dos problemas ocorrem depois da implementação do software onde se deve manter onde surge o maior problema onde leva mais tempo para resoluções e dificuldade de entendimento no final dele, sobrepondo as soluções e gerando dificuldade de entendimento.

# [Solid]:                                               
# Single Responsibility Principle   
# Open/Closed Principle
# Liskov Substitution Principle                                       
# Interface Segregation Principle
# Dependency Inversion Principle
# [=]
# Princípio da Responsabilidade Única
# Princípio Aberto/Fechado
# Princípio da Substituição de Liskov
# Princípio da Segregação de Interfaces
# Princípio da Inversão de Dependências
Tradução do significado

# Sequencia do SOLID aula 07/08/2025

SOLID: escrever a orientação do objeto de forma limpa e correta.

seta vazada preenchida = herança
seta preenchida = associação 
seta vazada tracejada = implementação (interface)

Single Resposability Principle: Cada pedaço de seu código tem uma unica responsabilidade.
Interface Segregation Principle: Particular de responsabilidade unica com foco em interfaces.
# Sequencia SOLID  11/08/2025.

Princípio da Inversão de Dependências: uma classe cliente de estabelecer dependencias prioritamente com abstrações e não implementações concretas, onde se inverte em vez depender classe, concreta clientes,devem depender de interfaces.
controladores tinham uma dependencia que dependiam das interfaces de serviço e não com a implementação completa o IMPL.

Prefira Composição a Herança:
filho recebe tudo de herança do pai, frequentemente dizem que gerança viola o encapsulamento das classses pai, composição e assosiação é melhor que a utilização de herança,
a melhor forma de utilizar a herança é (quando os filhos não tiverem ligação com o pai, onde um não substitui o outro).

Principio de DEMETER:
O principio do menor conhecimneto, todo metodo deveria invocar chamar as seguintes coisas ( sua propria classe), (de objetos passados como parametros), (de objetos criados pelo proprio metodo), (de atributos da classe do metodo),

Principio aberto/fechado:
uma classe deve estar fechada para modificação e aberta para extensao, afim de evitar maiores problemas não permitindo edição mas sim adição dessa classe.

Principios liskov:
Ser capaz de substituir um filho pelo outro sem quebra para que continue funcionando normalmente.

# Padrões de projeto
conjunto de soluções para problemas comuns da engenharia de software.

# Aula 28/08/2025
Arquitetura é sobre algo importante… seja lá o que for.

— Ralph Johnson

escrever uma arquitetura unicamente pela estrutura não exibe essa arquitetura em sua totalidade.“É uma arquitetura de microsserviços.” Nesse caso, o arquiteto fala apenas da estrutura do sistema, não da arquitetura do sistema.

Caracteristicas: As características da arquitetura são outra dimensão da definição da arquitetura de software. As características definem os critérios de sucesso de um sistema, em geral ortogonal quanto à funcionalidade. Note que todas as características listadas não requerem conhecimento da funcionalidade do sistema, embora sejam necessárias para ele funcionar corretamente. - (Requisitos não duncionais).

Decisões de arquitetura: É uma decição de qual modelo iremos utilizar para se trabalhar, onde buscamos escolher com base na maior familaridade com os prosutos de software e vuscamos agilidade e eficiencia na hora de fazer um modelo para se construir algo.(impedindo a camada de apresentação de fazer chamados diretos no banco de dados. As decisões da arquitetura formam os limites do sistema e orientam as equipes de desenvolvimento sobre o que é ou não permitido.)

Princios de desiner: Impedindo a camada de apresentação de fazer chamados diretos no banco de dados. As decisões da arquitetura formam os limites do sistema e orientam as equipes de desenvolvimento sobre o que é ou não permitido.(Evitar o uso de acoplamento no desenvolvimento de software, utilização de mensagem assincrona entre os bancos de dados, utilizando uma boa pratica para evitar dependencias e maiores problemas)

# 01/09/2025

# Expectativas de um arquiteto:
Tem como objetivo orientar o tipo de arquitetura sera usado nos projetos orientando a equipe e os projetos, tomar decições, analise, se manter atualizado com o mercado de trabalho e as novas tendencias de tecnologia sempre verificando o beneficio e os contra sobre a nova tendencia do mercado para gerar lucro para a empresa, o arquiteto tem a responsabilidade de tomar as decições dificeis e conseguir resolver os problemas, o arquiteto deve responder a conformidade do sistema fazendo com que sigam o projeto, possuir jogo de cintura politico na empresa navegando entre as gestões que tomam as deciçoes e clientes. 

# Operação/Devops
O proposito do devops é entregar valor para o vliente unindo os desenvolvedores e os arquitetos do software, planejamento, codificação, publicar o codigo em um lugar central, possui um ciclo infinito de trazer a satisfação do cliente junto das equipes de desenvolvimento do software, sendo dividido entre cultura e cargo onde possuem as suas diferenças. manter um controle das versões aonde seja confiavel.

# 04/09/2025
Resuma a diferençca entre: Arquitetura e Design:

Arquiteto: analisar os requisitos comerciais para extrair e definir as características da arquitetura (os “atributos”), selecionar quais padrões e estilos da arquitetura se encaixariam no domínio do problema e criar componentes, responsavel pela arquitetura do projeto o esqueleto do desenvolvimento.
Desgnir: 
Responsavel por transformar essas ideias do arquiteto em programa visual onde podemos ver o abstrato ao fisico e como essa ideia toma forma depende do designer por isso os dois devem estar juntos na equipe e em sintonia para melhor elaboração das ideias.

Como é a formação do conhecimento de um arquiteto modelo T:
O conhecimento do arquiteto em modelo T é de suma importancia para o desenvolvimento de software onde ele é responsavel por resolver problemas complexos com especialidade entendendo o contexto geral do projeto e do problema a ser resolvido sen muito adapitativel, dominado profundidade tecnica e amplitude interdiciplinar conectando nao somente o software mas tambem os conhecimentos da vida real.

# 08/09/2025
Na arquitetura não existe certou ou errado existe compensações, existe modelo por topico aonde existe assinantes que recebem a mensagem que desejam e os publicadores que mandam ela se tornando observadores do topico e recebendo a mensagem, a utilização da nuvem posssibilita a alta disponibilidade do topico onde funciona como uma notificação de algum evento sendo quem envia e voce o destinatario final, existi outras maneiras tambem dese utilizar um broken utilizando o sistema de filas tambem para manter a ordem, mantendo uma diferença distribuindo mais vezes as mensagem, onde tem uma fila para cada instancia, mantendo mais copias onde á armazena estas menssagens e as distribui posteriormente, no topico existe variação de que ele tera que distribuir em mais vezes e já na fila existe um maior acoplamento nas menssagens já que ele vai estar dependendo de uma instancia anterior para estar recebendo as informações, existindo um trade off nas trocas de mensagens não possuindo um certo ou um errado depende da aplicabilidade para o seu sistema.