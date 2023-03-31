## PARCIAL PRACTICO AREP CORTE 2

### Autor: Daniela García Romero

### Funcionamiento local

![img_1.png](img_1.png)

### Docker

* Se costrute la imagen en Docker con el siguiente comando:

```

docker build --tag dockersparkprimer .

```

![](img/img_1.png)

* Podemos revisar que la imagen fue creada

```

docker images

```

![](img/img_2.png)

![](img/img_3.png)

* Cree una instancia a partir de la imagen ya creada con el puerto 6000 enlazado

```

docker run -d -p 4567:6000 --name firstdockercontainer dockersparkprimer

```

Podemos ver que esta corriendo


![](img/img_4.png)

![](img/img_5.png)

![](img/img_6.png)

* Se crea el repositorio en docker hub
* 
![](img/img_7.png)

* Se crea una referencia al repositorio

```

docker tag dockersparkprimer danielagar320/firstsprkwebapprepo

```

![](img/img_8.png)

* Nos autenticamos y luego hacemos push al repositorio 


```

docker push danielagar320/parcial:latest

```

* Verificamos que se haya subido 

![](img/img_9.png)

* Instalamos docker en la instancia de aws

![img.png](img.png)

* Se adiciona el puerto

![img_2.png](img_2.png)

![img_5.png](img_5.png)




