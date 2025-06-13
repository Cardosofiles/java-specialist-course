# 🚀 Atalhos de Código Java no IntelliJ IDEA

Este documento reúne os principais **atalhos de código (Live Modelos)** disponíveis no
**IntelliJ IDEA** para facilitar a produtividade no desenvolvimento Java.

---

## 🧠 Estrutura Principal

| Atalho  | Expande para                                               |
|---------|------------------------------------------------------------|
| `psvm`  | `public static void main(String[] args) {}`                |
| `sout`  | `System.out.println();`                                    |
| `soutv` | `System.out.println("var = " + var);`                      |
| `soutm` | `System.out.println("methodName");` (nome do método atual) |

---

## 🔵 Controle de Fluxo

| Atalho  | Expande para                              |
|---------|-------------------------------------------|
| `ifn`   | `if (obj == null) {}`                     |
| `inn`   | `if (obj != null) {}`                     |
| `fori`  | `for (int i = 0; i < ; i++) {}`           |
| `iter`  | `for (Type item : collection) {}`         |
| `itar`  | `for (int i = 0; i < arr.length; i++) {}` |
| `while` | `while (condition) {}`                    |
| `do`    | `do { } while (condition);`               |

---

## 🟠 Classes, Métodos e Construtores

| Atalho   | Expande para                                           |
|----------|--------------------------------------------------------|
| `inst`   | `instanceof`                                           |
| `new`    | `new Type()`                                           |
| `null`   | `null`                                                 |
| `thr`    | `throw new`                                            |
| `try`    | `try { } catch (Exception e) { e.printStackTrace(); }` |
| `tryf`   | `try-with-resources`                                   |
| `switch` | `switch (var) { case : break; }`                       |

---

## 🔴 Testes e Anotações

| Atalho  | Expande para                                  |
|---------|-----------------------------------------------|
| `@test` | `@Test` (JUnit)                               |
| `testm` | Método de teste unitário com anotação `@Test` |

---

## 🟣 Diversos Úteis

| Atalho     | Expande para                                             |
|------------|----------------------------------------------------------|
| `soutp`    | `System.out.println("param = " + param);`                |
| `soutc`    | `System.out.println("class = " + getClass().getName());` |
| `toString` | Gera o método `toString()`                               |
| `equals`   | Gera o método `equals()`                                 |
| `hashCode` | Gera o método `hashCode()`                               |

---

## ⚙️ Como visualizar ou criar atalhos no IntelliJ

1. Acesse: `File > Settings > Editor > Live Templates`
2. Escolha a linguagem (ex: Java)
3. Veja todos os atalhos disponíveis
4. Clique em `+` para adicionar seus próprios templates

---

## 📌 Dica rápida: atalho `psvm`

Se você digitar no corpo da classe:

```java
psvm
public static void main(String[] args) {
    
}
