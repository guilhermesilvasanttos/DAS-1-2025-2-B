# das-1-2025-2-b

## Arquiteturade código: Engenharia de software
https://engsoftmoderna.info/cap5.html
https://integrada.minhabiblioteca.com.br/reader/books/9788550816043/pageid/0
https://integrada.minhabiblioteca.com.br/reader/books/9788577800469/pageid/0

https://refactoring.guru/design-patterns

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
conjunto de soluções para problemas comuns da engenharia de software, 

