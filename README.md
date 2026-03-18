# 🎩 Jogo do Mágico - Coelho na Cartola 🐇

Um jogo de adivinhação desenvolvido em **Java**, utilizando o padrão de projeto **Proxy** e arquitetura **MVC**.

---

## 🧠 Sobre o jogo

O jogador precisa adivinhar um número secreto entre **0 e 100**, onde o "coelho" está escondido dentro da cartola do mágico 🎩

A cada tentativa, o jogo informa se o número é:

* 🔼 Maior
* 🔽 Menor

Quando o jogador acerta:

* 🎉 O coelho sai da cartola
* 🏆 O resultado entra no ranking
* 📊 O TOP 5 é exibido

---

## 🧩 Tecnologias e conceitos

* ☕ Java
* 🧠 Programação Orientada a Objetos (POO)
* 🛡️ Padrão de Projeto Proxy
* 🏗️ Arquitetura MVC

---

## 📦 Estrutura do projeto

```
src/
│
├── model/        → Regras do jogo e entidades
├── service/      → Lógica de ranking
├── view/         → Interface com o usuário (console)
├── controller/   → Controle do fluxo do jogo
└── main/         → Classe principal
```

---

## 🚀 Como executar no Eclipse

1. Abra o Eclipse
2. Clique em **File > Import**
3. Selecione:

   ```
   Existing Projects into Workspace
   ```
4. Escolha a pasta do projeto
5. Clique em **Finish**

---

## ▶️ Executar o jogo

1. Vá até:

```
main/Main.java
```

2. Clique com o botão direito
3. Selecione:

```
Run As > Java Application
```

---

## 🎮 Funcionalidades

* 👤 Nome do jogador
* 🔢 Número aleatório (0 a 100)
* 📢 Dicas (maior ou menor)
* 🐇 Animação textual do coelho
* 🏆 Ranking com TOP 5
* 🔁 Jogar novamente
* 🔄 Trocar jogador

---

## 🧠 Padrão Proxy no projeto

O Proxy (`CartolaProxy`) controla o acesso à `CartolaReal`, permitindo:

* Contar tentativas
* Adicionar lógica extra
* Proteger o número secreto

---

## 📸 Exemplo do jogo

```
🎩 Bem-vindo ao jogo do mágico!
Digite seu nome: João

Palpite: 50
🔼 Maior!

Palpite: 75
🔽 Menor!

Palpite: 63
🎉 Acertou! O coelho saiu da cartola!
✨ Tentativas: 3

🏆 TOP 5:
1º - João (3)
```

---

## 💡 Melhorias futuras

* 💾 Salvar ranking em arquivo
* 🖥️ Interface gráfica (JavaFX/Swing)
* 🎵 Sons no jogo
* 🌐 Versão web

---

## 👨‍💻 Autor

Desenvolvido por **devlucasfernandes02**

---

## ⭐ Contribuição

Sinta-se à vontade para contribuir com melhorias!

---
