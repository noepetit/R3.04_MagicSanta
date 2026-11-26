# TD4 : Algorithmique « avancée »

## 1 Généralités

Écrivez les applications ci-dessous en Java et en respectant la norme de programmation donnée en cours puis testez-les.

Vous devez créer une application de simulation d'une colonie de lycanthropes (ou loups-garous). Vous pouvez effectuer ce TD dans le même projet que celui du *TD3 : Java, cas pratique* : les notions passerelles entre les deux TD sont écrites en emphase intense (*italique*).

Ci-dessous, vous trouverez les spécifications minimales de l'application. À vous de les compléter lorsque cela semble nécessaire. Vous devez également utiliser les modèles de conception lorsque cela semble pertinent et faire attention à la complexité de vos algorithmes, de sorte qu'elle soit la plus minimale possible. Il peut vous être utile de vous doter du savoir encyclopédique nécessaire pour rendre la modélisation la plus crédible possible.

> *Figure 1 - Simulation de colonies de lycanthropes*

---

## 1 Lycanthrope

Un lycanthrope possède les caractéristiques suivantes (en remplacement ou en plus d'éventuelles caractéristiques communes) :
* un sexe ;
* une catégorie d'âge (ayant au minimum comme valeurs : « jeune », « adulte » et « vieux ») ;
* une force ;
* un facteur de domination (correspondant à la différence entre les dominations exercées et celles subies) ;
* un rang (de domination) ;
* un « niveau » (correspondant au critère de qualité subjectif d'un lycanthrope, mâle comme femelle ; calculé en fonction de la catégorie d'âge, de la force, du facteur de domination et du rang) ;
* un facteur d'impétuosité ;
* la meute à laquelle il appartient (ou s'il est solitaire).

Un lycanthrope doit pouvoir :
* afficher ses caractéristiques ;
* hurler : pour communiquer avec d'autres lycanthropes en fonction du hurlement ;
* entendre un hurlement (s'il est en capacité de le faire) ;
* se séparer de sa meute ;
* se transformer en humain.

---

## 2 Meute de lycanthropes

### 2.1 Hiérarchie de meute

Les lycanthropes vivent en meutes organisées selon une hiérarchie stricte dirigée par le couple $\alpha$ (composé du mâle $\alpha$ et de la femelle $\alpha$). Pour éviter les conflits, il n'y a qu'une seule meute à un endroit donné même si elle peut être accompagnée de lycanthropes solitaires. Le rang de domination (c.-à-d. son niveau social dans la hiérarchie de la meute) est indiqué par une lettre de l'alphabet grec en minuscule ($\alpha, \beta, \gamma, \delta, \varepsilon, \dots, \omega$). Le classement se fait par ordre lexicographique (les individus $\beta$ sont soumis aux individus $\alpha$ mais dominent les individus $\gamma$ ainsi que tous les individus dominés par $\gamma$, etc.).

Les lycanthropes $\omega$ sont les lycanthropes considérés comme les souffre-douleurs de la meute entière. Il existe des lycanthropes $\omega$ même si la meute ne compte pas l'ensemble des rangs de domination possibles (une meute peut, par exemple, être uniquement composée de lycanthropes $\alpha$, $\beta$ et $\omega$).

Les lycanthropes ne se tuent pas entre eux.

### 2.2 Domination et soumission

Un lycanthrope peut tenter de dominer un autre lycanthrope seulement s'il le considère inférieur ou égal à sa force (en fonction de son facteur d'impétuosité), et si ce n'est pas la femelle $\alpha$. Si l'agresseur a un niveau supérieur à sa cible ou si la cible est un lycanthrope $\omega$, il accomplit sa domination. Sinon, la cible se montrera agressive envers le lycanthrope ayant tenté une domination. Un lycanthrope accomplissant une domination sur un autre lycanthrope augmente son facteur de domination et échange son rang avec ce dernier. Un lycanthrope acceptant de se soumettre ou un lycanthrope agressé baisse son facteur de domination.

Les lycanthropes $\omega$ sont des lycanthropes adultes considérés comme ayant une force insuffisante par rapport à la moyenne du groupe.

Lorsque le facteur de domination est en dessous d'un certain seuil, le lycanthrope perd naturellement un rang de domination s'il n'est pas le dernier de son sexe dans la meute à l'avoir (par exemple : le dernier mâle $\beta$ d'une meute ne pourra pas devenir un mâle $\gamma$).

### 2.3 Couple $\alpha$

Le mâle $\alpha$ est considéré comme étant le mâle ayant la plus grande force parmi les mâles adultes de la meute et la femelle $\alpha$, celle ayant la plus grande force des femelles adultes au moment où le couple est constitué. Le couple reste uni tant que le mâle $\alpha$ n'est pas dominé par un autre mâle (n'importe quel mâle adulte considérant être à la hauteur peut déclencher un conflit avec le mâle $\alpha$) : un nouveau couple sera alors constitué avec la femelle adulte ayant le plus haut niveau à ce moment-là (cela peut être l'ancienne femelle $\alpha$). Une femelle déchue du couple $\alpha$ prend le même rang de domination que son ancien conjoint.

### 2.4 Lycanthrope solitaire

De temps en temps, il arrive que les lycanthropes $\omega$ et les lycanthropes ayant échoués lors d'un conflit pour devenir mâle $\alpha$ se dispersent pour devenir solitaires (il sera alors possible de les déplacer individuellement dans un autre endroit). Il n'y a pas de rang de domination pour les lycanthropes solitaires (et pas de lycanthropes $\omega$ non plus). Une nouvelle meute sera fondée à partir du moment où il y a au moins un mâle et une femelle solitaires réunis dans un même endroit où il n'y a pas déjà une meute. Ces lycanthropes ne seront alors plus considérés comme solitaires et une nouvelle hiérarchie de meute sera mise en place.

### 2.5 Reproduction

Le couple $\alpha$ est le seul couple de la meute légitime, c'est-à-dire ayant le droit de se reproduire à la saison des amours (qui ne dure pas toute l'année). Une portée compte d'un à sept « jeunes » lycanthropes $\gamma$ (ou $\beta$ s'il n'y a pas déjà dans la meute).

### 2.6 Constitution de la meute

Une meute doit posséder les caractéristiques suivantes :
* un couple $\alpha$ ;
* des lycanthropes.

Elle doit permettre :
* d'afficher ses caractéristiques ;
* d'afficher les caractéristiques des lycanthropes qu'elle contient ;
* de créer une nouvelle hiérarchie de meute avec un ensemble de lycanthropes ;
* de constituer un couple $\alpha$ en fonction d'un mâle $\alpha$ (et de déchoir l'éventuel ancien couple) ;
* de lancer une reproduction de lycanthropes ;
* de décroitre les rangs de domination des lycanthropes de la meute naturellement ;
* de déclarer les lycanthropes $\omega$ ;
* d'ajouter et d'enlever des lycanthropes.

### 2.7 Constitution du couple $\alpha$

Un couple $\alpha$ doit posséder les caractéristiques suivantes :
* un lycanthrope mâle ;
* un lycanthrope femelle ;

Il doit permettre :
* d'afficher ses caractéristiques
* de réaliser une reproduction.

---

## 3 Hurlements

Les lycanthropes communiquent au moyen de hurlements (qui sont perçus depuis n'importe où), entre autres pour :
* exprimer l'appartenance à une meute (entre les membres de la meute ou pour avertir les individus d'une autre meute) : lorsqu'un lycanthrope d'une meute utilise ce type de hurlements, tous les autres membres du clan qui l'entendent lui répondent en lançant un hurlement du même type (mais cette réponse n'appelle pas d'autres réponses) ; ceux des autres meutes peuvent répondre par leur propre hurlement de meute ;
* exprimer la domination ;
* exprimer la soumission (en réponse à une expression de domination) ;
* exprimer l'agressivité (en réponse à une expression de domination ou envers un membre $\omega$).

Il y a donc plusieurs types d'hurlements mais chacun est émis par un lycanthrope.

Un hurlement doit permettre d'afficher ses caractéristiques.

---

## 4 Transformation en humain

Il arrive qu'un lycanthrope se transforme en humain. Lorsqu'il le fait, il y a une possibilité, en fonction de son niveau, pour qu'il puisse quitter sa meute et son *enclos* (ce qui est équivalent à la mort du lycanthrope). Cela peut avoir comme conséquence de bouleverser l'organisation d'une meute.

---

## 5 Colonie de lycanthropes

Une colonie de lycanthropes est constituée d'un ensemble de meutes proches (toutes les meutes de lycanthropes au même endroit).

Une colonie doit donc posséder des meutes.

Elle doit permettre d'afficher les lycanthropes de toutes les meutes.

S'il n'y a pas déjà une classe qui s'en charge, la colonie de lycanthropes doit en plus avoir la méthode principale de l'application (point d'entrée de la simulation) qui est chargée de modéliser l'aspect temporel de la gestion de la colonie. À intervalle régulier, cette méthode doit :
* déterminer si une nouvelle meute doit être créée et le faire le cas échéant ;
* déterminer si la saison des amours est arrivée et, le cas échéant, lancer une reproduction ;
* faire évoluer naturellement la hiérarchie des meutes ;
* faire vieillir certains lycanthropes ;
* générer des hurlements aléatoires entre certains lycanthropes ;
* transformer quelques lycanthropes en humains.

---

## 6 Simulation

Équilibrez la simulation pour la rendre ludique.

---
*Qualité de développement — Mickaël Martin Nevot*