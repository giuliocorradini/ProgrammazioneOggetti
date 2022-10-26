# Cosa NON è polimorfismo

Chiamare lo stesso metodo con firme diverse non è polimorfismo.

```java
Quadrato q = new Quadrato(2);

q = new Quadrato();
```

Non è polimorfismo.

`System.out.println(f[i])` è un pessimo esempio di polimorfismo.

# instanceof

Invece di salvarmi il nome della classe all'interno della classe stessa, posso usare un
operatore molto elegante `instanceof`.

```java
if(A instanceof B)
    ...
```

È binario e confronta, in un punto di un codice, se A si è specializzato in B.

# Object

Chi estende Figura? Apparentemente nulla, ma in realtà estende Object.

Object mette a disposizione dei metodi comodi, come `.getClass()`.

# Override

È molto importante mettere il marcatore Override perché mi aiuta a identificare eventuali
typo oppure errori nella ridefinizione della firma del metodo.
