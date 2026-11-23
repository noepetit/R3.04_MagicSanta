# TD4-2 : Java, cas pratique
## 1 Généralités

Écrivez les applications ci-dessous en Java et en respectant la norme de
programmation donnée en cours puis testez-les.

Vous devez créer une application de simulation de village du Père Noël.

Ci-dessous, vous trouverez la spécification minimale, parfois imprécise,
de l'application. À vous de créer des classes, des variables d'instance,
des méthodes ou des interfaces supplémentaires dès que cela semble
nécessaire. À vous également de vous doter du savoir encyclopédique
nécessaire pour rendre la modélisation la plus crédible possible.

*Figure 1 -- Simulation de village du Père Noël*

------------------------------------------------------------------------

## 1 Les personnages

Au minimum, l'application doit permettre de gérer des humanoïdes :
lutins, elfes postiers, fées de Noël, enfants visiteurs ainsi que des
créatures : rennes, lycanthropes, bonshommes de neige vivants, et
esprits du Nord.

Tous les personnages doivent posséder les caractéristiques suivantes :

-   un nom ;
-   un sexe ;
-   un âge ;
-   un indicateur de faim ;
-   un indicateur de fatigue (permettant de savoir s'il se repose ou
    non) ;
-   un indicateur de magie de Noël.

Chaque personnage doit pouvoir :

-   émettre un son ;
-   se déplacer ;
-   se restaurer (lorsqu'ils ne se reposent pas) ;
-   se reposer ou se mettre en activité ;
-   baisser ou augmenter sa magie de Noël.

Tous les personnages peuvent manger de la nourriture : biscuits,
chocolats chaud, guimauves, gruau d'avoine et friandises (sucres d'orge
et bonbons). Chaque sorte de nourriture a une valeur nutritive
spécifique.

De plus, les lutins et les enfants visiteurs doivent pouvoir se
divertir, les lutins, elfes postiers, et les fées de Noël doivent
pouvoir travailler et les être fantastiques (lutins, fées de Noël,
lycanthropes, bonshommes de neige vivants, esprits du Nord) doivent
pouvoir se comporter comme tels. À chaque fois qu'un personnage effectue
une des activités qui lui est propre, cela augmente sa magie de Noël.

Les enfants visiteurs se divertissent partout où ils se rendre. Leur
magie de Noël compte double.

Les bonshommes de neige vivants ne le restent pas s'ils restent trop
longtemps en intérieur.

Certains lutins se transforment temporairement en lutins farceurs, et
font donc des farces : lait magique, soupe au bas, papier toilette
roulé, yeux remuants, tyrolienne, etc. Les farces perçues font
légèrement augmenter la magie de Noël des humanoïdes qui ne sont pas au
travail, et légèrement baisser celle des créatures. Les farces sont en
quantités illimités et n'ont pas besoin d'être stockées.

Enfin, il arrive que, lors de rencontres funèbres, les humanoïdes se
fassent dévorer par les créatures, surtout quand ils se reposent ou,
dans une moindre mesure, quand ils sont bruyants, et en particulier par
les lycanthropes qui peuvent se rendre aux mêmes endroits qu'eux (sous
condition). Quand cela arrive, cela a pour effet de baisser
drastiquement la magie de Noël des humanoïdes assistant à la scène.

------------------------------------------------------------------------

## 2 Les bâtiments

Chaque bâtiment doit pouvoir contenir plusieurs personnages. Cependant,
il n'est pas possible de mettre n'importe quel type de personnage dans
n'importe quel bâtiment.

Un bâtiment doit posséder les caractéristiques suivantes :

-   une superficie ;
-   une capacité d'accueil ;
-   un degré de propreté (ayant au moins pour valeur : « mauvais », «
    correct » et « bon ») ;
-   le nombre de personnages présents ;
-   les personnages présents.

Il doit permettre :

-   d'afficher ses caractéristiques ainsi que les caractéristiques des
    personnages qu'il contient ;
-   d'accueillir des personnages ;
-   de donner la possibilité d'être entretenu lorsqu'il est sale et
    vide.

On distingue plusieurs types de bâtiment (fermés sans mention contraire)
:

-   la maison du Père Noël : bâtiment unique ne pouvant accueillir de
    personnage ;
-   la tour de l'horloge : bâtiment unique ne pouvant accueillir de
    personnage, comptabilise le niveau total de magie de Noël du village
    du Père Noël et, accessoirement, donne l'heure ;
-   les chalets dortoir : non mixte, permet aux humanoïdes de se reposer
    ;
-   les enclos : certains sont ouverts, n'accueille qu'un type de
    créature à la fois et leur permet de se reposer ;
-   les confiseries : permets à tous les personnages de se restaurer ;
-   les ateliers de fabrication : lieu de travail des lutins et fées de
    Noël, interdit aux créatures ;
-   les bureaux de poste : lieu de travail des elfes postiers, interdit
    aux créatures ;
-   les écoles de magie : lieu qui permet de se comporter librement en
    créatures fantastiques ;
-   les boutiques de jouets : lieu de divertissement, interdit aux
    créatures ;
-   les aires de jeux : lieu de divertissement, ouvert, permet de se
    comporter librement en créatures fantastiques, nécessite un
    entretien fréquent ;
-   les réserves : bâtiment ne pouvant accueillir de personnage, pouvant
    stocker différentes sortes de nourriture en quantités limitées, ne
    nécessite pas d'entretien ;
-   etc.

Tant qu'un personnage est dans un bâtiment, il y effectue
automatiquement toutes les activités correspondantes décrites ci-dessus
dans la description des bâtiments.

------------------------------------------------------------------------

## 3 Le Père Noël

Il n'y a qu'un seul Père Noël. Il ne possède pas de caractéristique.

Il doit pouvoir, lorsque cela est possible :

-   examiner un bâtiment (en affichant les caractéristiques du bâtiment
    ainsi ses personnages) ;
-   demander l'entretien d'un bâtiment ;
-   transférer un personnage d'un bâtiment à un autre.

À l'aide d'un menu, vous devez permettre à l'utilisateur de pouvoir
diriger le Père Noël.

------------------------------------------------------------------------

## 4 Le village du Père Noël

Le village du Père Noël doit posséder les caractéristiques suivantes :

-   le Père Noël ;
-   une superficie maximale ;
-   une capacité d'accueil maximale ;
-   les bâtiments actuels.

Il doit permettre :

-   d'afficher le nombre de personnages présents au village du Père Noël
    ;
-   d'afficher les personnages de tous les bâtiments.

Il doit en plus avoir la méthode principale de l'application (point
d'entrée de la simulation) qui est chargée de modéliser « l'aspect
temporel » de la gestion du village du Père Noël. À intervalle régulier
ou non, cette méthode doit :

-   modifier aléatoirement l'état de certains personnages (les affamer,
    les fatiguer, etc.) ;
-   modifier aléatoirement l'état de propreté de certains bâtiments ;
-   augmenter aléatoirement les quantités de certaines nourritures dans
    certaines réserves ;
-   générer aléatoirement l'émission de sons de certains personnages ;
-   générer aléatoirement des rencontres funèbres ;
-   passer la main au Père Noël (et donc à l'utilisateur) pour qu'il
    s'occupe du village du Père Noël (son nombre d'action par intervalle
    de temps devant être limité).

------------------------------------------------------------------------

## 5 Simulation

Équilibrez la simulation pour la rendre ludique.

Pour cela, commencer par faire gagner la partie en lançant la tournée du
Père Noël lorsque le niveau de magie de Noël total du village dépasse un
certain seuil et, a contrario, la faire perdre lorsqu'il devient trop
faible.
