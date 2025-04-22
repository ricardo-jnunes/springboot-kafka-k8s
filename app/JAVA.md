# Conceitos JAVA

## Classes

- Interface	
	- Define um conjunto de métodos que uma classe deve implementar, como um contrato. Define comportamentos comuns.
	- Quando se precisa hernança de múltiplos comportamentos (Java não permite herança múltiplas de classes, mas permite implementar várias interfaces)
	- A partir do Java 8: métodos default (com implementação) e static
	- A partir do Java 9: métodos private

- Abstract
	- Permite métodos abstrados (subclasses implementam)e métodos concretos (implementados)
	- Permite atributos e construtores
	- Modelar herança

## Modificadoes de visibilidade ou acesso

- public
Qualquer classes, de qualquer pacote

- protected 
Classes do mesmo pacote ou  através de herança (aí fica vísivel para outro pacote)

- private
Apenas vísivel dentro da própria classe

- Sem modificador (package-private)
Apenas classes do mesmo pacote

## static em...

| `static` em...       | Significado                                         |
|------------------------|-----------------------------------------------------|
| Atributo               | Compartilhado entre todas as instâncias             |
| Método                 | Pode ser chamado sem instanciar                     |
| Bloco                  | Executado uma vez, ao carregar a classe             |
| Interface (método)     | Função utilitária da interface                      |
| Classe interna         | Não depende de instância da classe externa. (uma classe definida dentro de outra classe. Ela é usada principalmente para organizar melhor o código e manter a lógica relacionada junta.)         |

