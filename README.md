# Sistema de Universidade - Java (POO)

Projeto simples desenvolvido em **Java** com o objetivo de praticar conceitos de **Programação Orientada a Objetos**, principalmente **relações entre classes**.

Este projeto simula um pequeno sistema universitário onde alunos podem se matricular em cursos que possuem professores responsáveis.

---

## 🎯 Objetivo do Projeto

Praticar conceitos fundamentais de POO, como:

- Criação de classes e objetos
- Encapsulamento
- Construtores
- Arrays de objetos
- **Relação entre classes**
- Organização de responsabilidades no sistema

---

## 🧠 Modelagem do Sistema

O sistema foi modelado com quatro entidades principais:

- **Aluno**
- **Curso**
- **Professor**
- **Sistema**

Cada classe possui uma responsabilidade específica dentro da aplicação.

---

## 🔗 Relações entre as classes

Este projeto foca principalmente na prática de **relações entre objetos**.

### 1️⃣ Aluno → Cursos (1:N)

Um aluno pode estar matriculado em **vários cursos**.

```text
Aluno
 ├ Curso
 ├ Curso
 └ Curso