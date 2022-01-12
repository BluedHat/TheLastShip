<h1> The Last Ship </h1>

<h3> Descrição do jogo: </h3>

Apesar do nome engraçadinho, é um jogo simples de Batalha Naval,
usando terminal Java. Há planos para expansão, mas toda casa começa pela fundação.

Como qualquer jogo em linha de comando, você irá inserir as cordenadas, no formato Linha+ Enter Coluna + Enter. Exemplo:

1C

O jogo só irá validar a sua entrada se for na ordem acima e se as letras forem em CAPSLOCK.

<h3> Regras do Jogo :</h3>

<li> Você começa o jogo com 30 vidas e 30 tiros.
<li> Conforme as jogadas os números acima irão aumentar ou diminuir.
<li> Nosso tabuleiro tem tamanho 10 x 10  fixo totalizando 100 casas </li>
<li> Também há uma sistema de pontuação. A cada acerto = +1 ponto , a cada erro -1 ponto </li>
<li> Como a vida não é fácil, você começa o jogo com 15 pontos rs </li>

<li> Caso queira alterar a duração do jogo, mexa no arquivo Player(em Vidas, Armada e Shoots -  em caso de dúvida ver o Infraestrutura.md) </li>
<li></li> O Raking com as pontuações do player 1 e o resultado da partida está no arquivo Ranking.txt na raiz do projeto.
O jogo pode ser encerrado de quatro formas:
<br>
<li> 1 - Suas vidas acabaram </li>
<li> 2 - Seus tiros acabaram </li>
<li> 3 - Você acertou toda a frota inimiga </li>
<li> 4 - O inimigo acertou toda a sua frota </li>

Os níveis de dificuldade citados no início do jogo versam diretamente sobre a quantidade
de navios que serão inseridos no tabuleiro (mas ...sempre podemos te surpreender).

Tanto os seus navios quanto os do oponente são lançados ao mar de forma aleatoria.

<h3> Simbologia </h3>

<p> X =>  Você errou </p>
<p> * =>  Você acertou </p>
<p> N =>  Embarcação </p>
<p> ~ =>  Água </p>

<p> Abaixo segue um exemplo de tabuleiro, repare  que:

<p>4H => Temos um Navio </p>
<p>8D => Uma jogada que resultou em erro </p>
<p>3C => Uma jogada que resultou em acerto </p>

     A   B   C   D   E   F   G   H   I   J 
<p> 01 | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ </p>
<p> 02 | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ </p>
<p> 03 | ~ | * | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ </p>
<p> 04 | ~ | ~ | ~ | ~ | ~ | ~ | N | ~ | ~ | ~ </p>
<p> 05 | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ </p>
<p> 06 | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ </p>
<p> 07 | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ </p>
<p> 08 | ~ | ~ | X | ~ | ~ | ~ | ~ | ~ | ~ | ~ </p>
<p> 09 | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ </p>
<p> 10 | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ | ~ </p>

<h6> Agora seja um bom capitão, proteja a frota do Nathan James 
e a salve a sua tripulação, boa sorte </h6>