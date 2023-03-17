# poc-aspect-logger
## Comment lancer le projet 
- Soit depuis votre IDE préférez vous pouvez executer la classe DemoApplication
- Soit depuis un cmd, vous pouvez executer la commande 
```
./mvnw spring-boot:run
```
## Comment l'utiliser
- Soit depuis votre client HTTP vous pouvez effectuer un GET localhost:8080/clients
- Soit, etant donné que c'est un GET, vous pouvez juste ouvrir votre navigateur et aller sur localhost:8080/clients
- Après quoi, observez la console de votre application et vous y verez des logs.
- 
## But du projet
La classe ```com.example.demo.aop.LoggerAspect``` est un exemple de logger appliqué sur deux pointcuts :
1. Les méthodes portant l'annotation custom ```com.example.demo.aop.annotations.LogAround```
2. Les opérations présentes dans les classes portant l'annotation RestController.

L'advice permet de log l'entrée avec params et la sortie avec résultat pour ces deux pointcuts
