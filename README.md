# das-1-2025-2-b

## Arquiteturade código: Engenharia de software
https://engsoftmoderna.info/cap5.html

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
Desenvolvimento em paralelo. Suponha que um sistema X foi implementado por meio de classes C1, C2, …, Cn. Quando essas classes ocultam suas principais informações, fica mais fácil implementá-las em paralelo, por desenvolvedores diferentes. Consequentemente, teremos uma redução no tempo total de implementação do sistema.

Flexibilidade a mudanças. Por exemplo, suponha que descobrimos que a classe Ci é responsável pelos problemas de desempenho do sistema. Quando detalhes de implementação de Ci são ocultados do resto do sistema, fica mais fácil trocar sua implementação por uma classe Ci', que use estruturas de dados e algoritmos mais eficientes. Essa troca também é mais segura, pois como as classes são independentes, diminui-se o risco de a mudança introduzir bugs em outras classes.

Facilidade de entendimento. Por exemplo, um novo desenvolvedor contratado pela empresa pode ser alocado para trabalhar em algumas classes apenas. Portanto, ele não precisará entender toda a complexidade do sistema, mas apenas a implementação das classes pelas quais ficou responsável.

No entanto, para se atingir os benefícios acima, classes devem satisfazer à seguinte condição (ou critério): elas devem esconder decisões de projeto que são sujeitas a mudanças. Devemos entender decisão de projeto como qualquer aspecto de projeto da classe, como os requisitos que ela implementa ou os algoritmos e estruturas de dados que serão usados no seu código.
