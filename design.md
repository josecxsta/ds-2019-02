## Design detalhado do projeto

- D1: Crie a interface StorageService com os métodos listBuckets, createBucket.

- D2: Crie classes GoogleStorageService e AmazonStorageService que implementam a interface StorageService.

- D3: Crie classe StorageCredential que armazenará a chave ou token da conta de serviço do serviço de armazenamento, além do host para requisições

- D4: Utilize o Google Cloud Java Client for Storage

- D5: Utilize o AWS SDK para Java

- D6: Crie a classe Bucket com os métodos listFiles, sendFile, getFile, updateFile, deleteFile

- D7: Utilize o Spring MVC para criar a aplicação web que receberá as requisições

- D8: Utilize JSON para receber dados de requisições e, também, para retornar dados de requisições

- D9: Utilize o GSON para serializar e desserializar objetos JSON

- D10: Utilize o header Authorization com os dados de autorização dos serviços de armazenamento em todas as requisições HTTP

- D11: Utilize o Log4j para registrar todos os logs relevantes da aplicação

- D12: Faça a discriminação do serviço de armazenamento através de um header de nome StorageService ("GOOGLE" e "AMAZON" são os únicos aceitos por enquanto)