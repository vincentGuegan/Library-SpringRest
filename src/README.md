# Challenge

#### Save the library, save the world

![library](http://images.innoveduc.fr/java/spring_rest/library.jpg)

Félicitations, tu viens d'être nommé grand bibliothécaire de la Wild Code School !

Sur le modèle de ce que tu as réalisé lors de cette quête, auras-tu l'audace de relever l'extraordinaire défi de créer une application Spring RESTful permettant de gérer les livres disponibles dans ta bibliothèque ? Pour ce faire, suis les étapes suivantes :

1.  Créer une BDD MySQL et initialiser un projet Spring communiquant avec celle-ci
2.  Créer une entité  `Book`  ayant pour attributs  `title`,  `author`  et  `description`
3.  Créer un  `BookRepository`  permettant de réaliser les 4 opérations CRUD + une opération de recherche par mot-clé contenu dans le titre ou la description
4.  Mettre en place un controller répondant aux critères REST
5.  Tester l'application dans  _Postman_
6.  Envoyer le projet vers son dépôt distant et partager le lien en solution.

#### Critères de validation

-   Toutes les requêtes envoyées vers l'application Spring via  _Postman_  (verbes  `GET`,  `POST`,  `PUT`  et  `DELETE`) fonctionnent et renvoient des réponses cohérentes.