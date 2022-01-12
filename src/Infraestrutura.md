<h1> Detalhamento da infraestrutura </h1>

<h4>Árvore de Pastas:</h4>

<li> Account: Contém os arquivos referentes a dados de usuários. <br>
<li> Army: Contém os arquivos aos Navios e sua infra.
<li> Places:  distribuição de Navios no Mar</li>
<li> Core: Impressão, Scan </li>

<h4>Packpage Account</h4>
<li> Computer: Geração de Jogadas pelo Computador </li>
<li> Gameplay: Níveis de Jogo(Médio, Fácil, Dificil)</li>
<li> Player:   Dados base de pontuação dos jogadores </li>
<li> Round: Infraestrutura de Jogadas </li>
<li> Playerdata: Aplicação do tabuleiro para cada jogador </li>


<h4>Packpage Army</h4>
<li>Shield: Infrabase dos Navios</li>
<li>Boat, Aerocarryer, Destroyer, Submarine e Tanker: Navios, cada qual com a sua particularidade</li>
<li>Sort: Distribuição aleatoria de navios em função do nível do Jogo </li>

<h4>Packpage Places</h4>
<li>CheckColab: Verifica se já existe um navio posicionado no ponto de busca</li>
<li>CheckSpace: Verifica se há espaço para alocação do navio de acordo com o mesmo</li>
<li>Compass: Escolhe de forma aleatoria a disposição do navio(vertical ou horizontal)</li>
<li>Sea: Cria os tabuleiros e executa a distribuição dos navios(ainda no modelo 0 e 1 - 0 = agua 1 = navio )</li>

<h4>Packpage Core</h4>
<li>Printer: Formata os tabuleiros</li>
<li>Scan: Entrada de dados do usuário(nome, nível, jogadas)</li>


<h4>Extras </h4>
<li>Main: Concatenação do jogo(arquivo que deve ser executado para jogar</li>
<li>Ranking.txt -  Lista com ranking dos jogadores</li>
<li>Read - instruções </li>
<li>Save Ranking: Salve o ranking a cada jogo</li>


<h4>Basis </h4>
<li> TODO -  Arquivos Player1, Player2, PlayerBase, BadGood e Shooter que são referentes a fase 2 do jogo no qual os dados de usuários 
serão tratados a partir de uma interface </li>