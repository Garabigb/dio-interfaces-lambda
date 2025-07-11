# dio-interfaces-lambda
Aula de interface e lambda do curso.


### **Resumo: Interface vs. Abstract Class em Java**  

| **Característica**          | **Interface** (`interface`)                          | **Classe Abstrata** (`abstract class`)               |
|-----------------------------|----------------------------------------------------|----------------------------------------------------|
| **Herança**                 | Pode ser implementada por várias classes (`implements`). | Só pode ser estendida por uma classe (`extends`). |
| **Métodos**                 | - Todos os métodos são `public abstract` por padrão (antes do Java 8).<br>- Pode ter `default`, `static` e `private` (Java 8+). | - Pode ter métodos abstratos (`abstract`) e concretos. |
| **Atributos**               | - Só constantes (`public static final`).<br>- Não pode ter campos de instância. | - Pode ter atributos normais (instância e estáticos). |
| **Construtor**              | ❌ Não pode ter construtores. | ✅ Pode ter construtores (usado na inicialização de subclasses). |
| **Modificador de Acesso**   | Métodos são sempre `public` (a menos que `private` em Java 9+). | Pode ter métodos `public`, `protected`, `private`, etc. |
| **Uso Principal**           | Definir **contratos** (o que uma classe deve fazer). | Prover **comportamento parcial** e reutilização de código. |
| **Exemplo**                 | ```java<br>interface Veiculo {<br>    void acelerar();<br>}<br>``` | ```java<br>abstract class Animal {<br>    abstract void fazerSom();<br>    void dormir() { ... }<br>}<br>``` |

### **Quando Usar?**  
✅ **Use `interface` quando:**  
- Quer definir um contrato para múltiplas classes não relacionadas.  
- Precisa de herança múltipla (uma classe pode implementar várias interfaces).  
- Quer adicionar métodos padrão (`default`) sem quebrar implementações existentes.  

✅ **Use `abstract class` quando:**  
- Há lógica comum que subclasses devem herdar.  
- Precisa de campos não constantes ou construtores.  
- Quer controlar modificadores de acesso (`protected`, `private`).  

### **Conclusão:**  
- **Interfaces** são ideais para **definir capacidades** (ex: `Serializable`, `Comparable`).  
- **Classes abstratas** são úteis para **compartilhar código entre classes relacionadas**.  
- A partir do Java 8, interfaces podem ter métodos `default` e `static`, reduzindo a necessidade de classes abstratas em alguns casos.  

Ambos são fundamentais para **polimorfismo** e **boas práticas de OO** em Java! 🚀
