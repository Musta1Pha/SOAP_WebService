# SOAP WEB SERVICE

Dans ce TP, nous avons créé un service web appelé "BanqueService" et nous l'avons déployé sur un serveur nommé "jaxws". De plus, nous avons consulté et analysé le WSDL (Web Services Description Language) en utilisant un navigateur HTTP. Ensuite, nous avons testé les opérations du service à l'aide de l'outil SOAPUI. Enfin, nous avons développé un client Java qui va mettre en œuvre ce service web en utilisant un middleware appelé "stub".

![WebService_architecture](https://github.com/Musta1Pha/SOAP_WebService/assets/91842692/9ff51146-3179-4927-ab24-aef5a8e69e8b)


<h2>Création du Web service BanqueService</h2>

![WebService_1](https://github.com/Musta1Pha/SOAP_WebService/assets/91842692/e2da1ea6-ed53-474d-874f-af0492d42373)

<h2>Création de la classe Compte</h2>

![WebService_2](https://github.com/Musta1Pha/SOAP_WebService/assets/91842692/535ec9ed-8616-4d4f-95b5-cba8812d2507)

<h2>Création du serveur JaxWS</h2><h5>Spécification de l'adresse du serveur ainsi que l'instance du web service utilisé</h5>
  
  - En spécifiant "0.0.0.0" comme adresse IP, le service web sera accessible via toutes les interfaces réseau de la machine. Cela signifie que le service est disponible pour les requêtes provenant de n'importe quelle adresse IP, y compris celles provenant du réseau local      et du réseau externe (si la machine dispose de plusieurs interfaces réseau).
    
  ![WebService_main](https://github.com/Musta1Pha/SOAP_WebService/assets/91842692/7a2f7b8d-0e7a-4234-872d-5f9ea7ea4384)

<h2>WSDL Obtenu + Test des opérations via SOUPUI</h2>

![WebService_wsdl](https://github.com/Musta1Pha/SOAP_WebService/assets/91842692/f0b42dc1-98e4-4aef-8bc0-6c80ebacfbc4)

![WebService_soupui](https://github.com/Musta1Pha/SOAP_WebService/assets/91842692/a4da30ae-de06-4994-9548-2cf89d87c1be)

<h1>Création du client JAVA</h1>
<h5>Génération du proxy à partir du WSDL</h5>

![WebService_client_1](https://github.com/Musta1Pha/SOAP_WebService/assets/91842692/f15a7312-2ba5-4f0f-a284-2deb530df10f)

<h5>Lors de l'utilisation d'un service web, à partir du WSDL, je génère un proxy côté client. Chaque fois que je souhaite appeler une méthode, je fais appel au stub. Le stub envoie ensuite la requête au serveur distant via le squelette (skeleton).</h5>

![WebService_client_2](https://github.com/Musta1Pha/SOAP_WebService/assets/91842692/f6bc8639-e3c4-479c-aefb-d8b8701a893a)
