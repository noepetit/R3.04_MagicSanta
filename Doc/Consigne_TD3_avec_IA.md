# TD4-2 : Java, cas pratique

**Version :** 5.0.0\
**Auteur :** Mickaël Martin Nevot\
**Document en ligne :**
[www.mickael-martin-nevot.com](https://www.mickael-martin-nevot.com)

> Cette œuvre est mise à disposition selon les termes de la licence
> Creative Commons Attribution -- Pas d'Utilisation Commerciale --
> Partage à l'Identique 3.0 non transposé.

------------------------------------------------------------------------

## 1. Généralités

Écrivez les applications ci-dessous en Java et en respectant la norme de
programmation donnée en cours, puis testez-les.

Vous devez créer une application de **simulation de village du Père
Noël**.

Ci-dessous, vous trouverez la spécification minimale, parfois imprécise,
de l'application. À vous de créer des classes, des variables d'instance,
des méthodes ou des interfaces supplémentaires dès que cela semble
nécessaire. À vous également de vous doter du savoir encyclopédique
nécessaire pour rendre la modélisation la plus crédible possible.

------------------------------------------------------------------------

## 1. Les personnages

Au minimum, l'application doit permettre de gérer :

-   **Des humanoïdes :**
    -   lutins ;
    -   elfes postiers ;
    -   fées de Noël ;
    -   enfants visiteurs.
-   **Des créatures :**
    -   rennes ;
    -   lycanthropes ;
    -   bonshommes de neige vivants ;
    -   esprits du Nord.

### 1.1. Caractéristiques communes

Tous les personnages doivent posséder les caractéristiques suivantes :

-   un nom ;
-   un sexe ;
-   un âge ;
-   un indicateur de faim ;
-   un indicateur de fatigue (permettant de savoir s'il se repose ou
    non) ;
-   un indicateur de magie de Noël.

### 1.2. Actions communes

Chaque personnage doit pouvoir :

-   émettre un son ;
-   se déplacer ;
-   se restaurer (lorsqu'il ne se repose pas) ;
-   se reposer ou se mettre en activité ;
-   baisser ou augmenter sa magie de Noël.

Tous les personnages peuvent manger de la nourriture :

-   biscuits ;
-   chocolat chaud ;
-   guimauves ;
-   gruau d'avoine ;
-   friandises (sucres d'orge et bonbons).

Chaque sorte de nourriture possède une valeur nutritive spécifique.

### 1.3. Activités propres aux personnages

-   Les lutins et les enfants visiteurs doivent pouvoir se divertir.
-   Les lutins, les elfes postiers et les fées de Noël doivent pouvoir
    travailler.
-   Les êtres fantastiques (lutins, fées de Noël, lycanthropes,
    bonshommes de neige vivants et esprits du Nord) doivent pouvoir se
    comporter comme tels.

Chaque fois qu'un personnage effectue l'une des activités qui lui est
propre, cela augmente sa magie de Noël.

Les enfants visiteurs se divertissent partout où ils se rendent. Leur
magie de Noël compte double.

Les bonshommes de neige vivants ne le restent pas s'ils restent trop
longtemps en intérieur.

### 1.4. Lutins farceurs et farces

Certains lutins se transforment temporairement en **lutins farceurs** et
font donc des farces, par exemple :

-   lait magique ;
-   soupe au bas ;
-   papier toilette roulé ;
-   yeux remuants ;
-   tyrolienne ;
-   etc.

Les farces perçues font :

-   légèrement augmenter la magie de Noël des humanoïdes qui ne sont pas
    au travail ;
-   légèrement baisser la magie de Noël des créatures.

Les farces sont en quantité illimitée et n'ont pas besoin d'être
stockées.

### 1.5. Rencontres funèbres

Lors de rencontres funèbres, les humanoïdes peuvent se faire dévorer par
les créatures, surtout lorsqu'ils se reposent ou, dans une moindre
mesure, lorsqu'ils sont bruyants.

Cela concerne en particulier les lycanthropes, qui peuvent se rendre aux
mêmes endroits que les humanoïdes, sous certaines conditions.

Lorsqu'un tel événement se produit, la magie de Noël des humanoïdes
assistant à la scène baisse drastiquement.

------------------------------------------------------------------------

## 2. Les bâtiments

Chaque bâtiment doit pouvoir contenir plusieurs personnages. Cependant,
il n'est pas possible de mettre n'importe quel type de personnage dans
n'importe quel bâtiment.

### 2.1. Caractéristiques d'un bâtiment

Un bâtiment doit posséder les caractéristiques suivantes :

-   une superficie ;
-   une capacité d'accueil ;
-   un degré de propreté, ayant au moins les valeurs suivantes :
    -   mauvais ;
    -   correct ;
    -   bon ;
-   le nombre de personnages présents ;
-   la liste des personnages présents.

### 2.2. Fonctionnalités communes

Un bâtiment doit permettre :

-   d'afficher ses caractéristiques ainsi que celles des personnages
    qu'il contient ;
-   d'accueillir des personnages ;
-   de donner la possibilité d'être entretenu lorsqu'il est sale et
    vide.

### 2.3. Types de bâtiments

On distingue plusieurs types de bâtiments. Ils sont **fermés**, sauf
mention contraire.

  -----------------------------------------------------------------------
  Bâtiment                            Règles et fonctions
  ----------------------------------- -----------------------------------
  **Maison du Père Noël**             Bâtiment unique ne pouvant
                                      accueillir de personnage.

  **Tour de l'horloge**               Bâtiment unique ne pouvant
                                      accueillir de personnage. Elle
                                      comptabilise le niveau total de
                                      magie de Noël du village et,
                                      accessoirement, donne l'heure.

  **Chalets dortoir**                 Non mixtes ; ils permettent aux
                                      humanoïdes de se reposer.

  **Enclos**                          Certains sont ouverts. Chaque
                                      enclos n'accueille qu'un seul type
                                      de créature à la fois et lui permet
                                      de se reposer.

  **Confiseries**                     Elles permettent à tous les
                                      personnages de se restaurer.

  **Ateliers de fabrication**         Lieux de travail des lutins et des
                                      fées de Noël ; les créatures y sont
                                      interdites.

  **Bureaux de poste**                Lieux de travail des elfes postiers
                                      ; les créatures y sont interdites.

  **Écoles de magie**                 Lieux permettant aux créatures
                                      fantastiques de se comporter
                                      librement comme telles.

  **Boutiques de jouets**             Lieux de divertissement ; les
                                      créatures y sont interdites.

  **Aires de jeux**                   Lieux de divertissement ouverts,
                                      permettant aux créatures
                                      fantastiques de se comporter
                                      librement comme telles. Elles
                                      nécessitent un entretien fréquent.

  **Réserves**                        Bâtiments ne pouvant accueillir de
                                      personnage. Elles peuvent stocker
                                      différentes sortes de nourriture en
                                      quantités limitées et ne
                                      nécessitent pas d'entretien.

  **Autres**                          D'autres types de bâtiments peuvent
                                      être ajoutés si nécessaire.
  -----------------------------------------------------------------------

Tant qu'un personnage se trouve dans un bâtiment, il y effectue
automatiquement toutes les activités correspondantes décrites ci-dessus
dans la description des bâtiments.

------------------------------------------------------------------------

## 3. Le Père Noël

Il n'y a qu'un seul Père Noël. Il ne possède pas de caractéristique.

Il doit pouvoir, lorsque cela est possible :

-   examiner un bâtiment, en affichant les caractéristiques du bâtiment
    ainsi que celles des personnages qu'il contient ;
-   demander l'entretien d'un bâtiment ;
-   transférer un personnage d'un bâtiment à un autre.

À l'aide d'un menu, vous devez permettre à l'utilisateur de diriger le
Père Noël.

------------------------------------------------------------------------

## 4. Le village du Père Noël

### 4.1. Caractéristiques du village

Le village du Père Noël doit posséder les caractéristiques suivantes :

-   le Père Noël ;
-   une superficie maximale ;
-   une capacité d'accueil maximale ;
-   les bâtiments actuels.

### 4.2. Fonctionnalités du village

Le village doit permettre :

-   d'afficher le nombre de personnages présents dans le village du Père
    Noël ;
-   d'afficher les personnages de tous les bâtiments.

### 4.3. Déroulement temporel de la simulation

Le village doit également contenir la méthode principale de
l'application (point d'entrée de la simulation). Cette méthode est
chargée de modéliser l'« aspect temporel » de la gestion du village du
Père Noël.

À intervalle régulier ou non, cette méthode doit :

-   modifier aléatoirement l'état de certains personnages (les affamer,
    les fatiguer, etc.) ;
-   modifier aléatoirement l'état de propreté de certains bâtiments ;
-   augmenter aléatoirement les quantités de certaines nourritures dans
    certaines réserves ;
-   générer aléatoirement l'émission de sons de certains personnages ;
-   générer aléatoirement des rencontres funèbres ;
-   passer la main au Père Noël (et donc à l'utilisateur) pour qu'il
    s'occupe du village du Père Noël. Son nombre d'actions par
    intervalle de temps doit être limité.

------------------------------------------------------------------------

## 5. Simulation

Équilibrez la simulation pour la rendre ludique.

Pour cela, commencez par faire gagner la partie en lançant la tournée du
Père Noël lorsque le niveau total de magie de Noël du village dépasse un
certain seuil et, a contrario, faites perdre la partie lorsqu'il devient
trop faible.
