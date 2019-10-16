## Conceitos fundamentais

### Bucket

Buckets são os discos básicos que armazenam dados.

### FileObject

FileObjects são os dados individuais que você armazena no Cloud Storage. Não há limite no número de objetos que você crie em um intervalo.

Os FileObjects têm dois componentes: dados e metadados. Os dados geralmente são um arquivo que você quer armazenar no Cloud Storage. Metadados são uma coleção de pares de nome-valor que descrevem várias qualidades do FileObject.


## Design detalhado do projeto

- D1: Crie a interface StorageService com os métodos listBuckets, createBucket.

- D2: Crie classes GoogleStorageService e AmazonStorageService que implementam a interface StorageService.

- D3: Crie classe StorageCredential que armazenará a chave ou token da conta de serviço do serviço de armazenamento, além do host para requisições

- D4: Utilize o Google Cloud Java Client for Storage

- D5: Utilize o AWS SDK para Java

- D6: Crie a classe BucketService com os métodos listFiles, sendFile, getFile, updateFile, deleteFile

- D7: Utilize o GSON para serializar e desserializar objetos JSON

- D8: Utilize o Log4j para registrar todos os logs relevantes da aplicação

- D9: Faça a discriminação do serviço de armazenamento através de um header de nome StorageService ("GOOGLE" e "AMAZON" são os únicos aceitos por enquanto)