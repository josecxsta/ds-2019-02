## Conceitos fundamentais

### Bucket

**Buckets** são os discos que armazenam dados. Cada intervalo deve possuir um nome global exclusivo em seu serviço de armazenamento.

### FileObject

**FileObjects** são os dados individuais que podem ser armazenados nos Buckets. Os FileObjects têm dois componentes: dados e metadados. Os dados geralmente são um arquivo que você quer armazenar no Bucket. Metadados são uma coleção de pares de nome-valor que descrevem várias qualidades do FileObject.


## Design detalhado do projeto

- Crie o enum **Platforms** com os serviços de armazenamento (Google, Amazon);

- Crie a classe **UnifiedApi** que terá os métodos bucket(), que instanciará um BucketService. Essa classe deverá ter um construtor que recebe um Platforms com o nome do serviço para o acesso ao serviço de armazenamento.
Exemplo:

```
UnifiedApi storageApi = new UnifiedApi(Platforms.Amazon);
ArrayList<Bucket> buckets = storageApi.bucket().getAll();
 ```

A classe UnifiedApi deve possuir um atributo storageService, do tipo StorageService, e deverá ser instanciado de acordo com a plataforma escolhida no construtor. Deve ser retornado um erro caso a plataforma não exista ou caso as variáveis de ambiente dessa plataforma não estejam definidas;

- Para autenticar nos serviços de armazenamento é necessário salvar variáveis de ambiente com algumas chaves. No caso do Google é necessário definir a variável de ambiente `GOOGLE_APPLICATION_CREDENTIALS` com o caminho para um arquivo .json contendo a chave da conta de serviço que possui permissões no Google Cloud Storage. No caso do serviço da Amazon, é necessário definir as seguintes variáveis de ambiente: `AWS_ACCESS_KEY_ID` e `AWS_SECRET_ACCESS_KEY` com dados da conta de serviço;

- Crie a interface **StorageService** com um método que verifica as variáveis de ambiente para autenticação, utiliza um cliente para acesso a plataforma de armazenamento e possui como propriedades BucketService e FileObjectService;

- Crie classes **GoogleStorageService** e **AmazonStorageService** que implementam a interface StorageService;

- Crie a interface **BucketService** com os métodos getAll(): Bucket[], get(name: String): Bucket, delete(name: String,): void, create(name: String): Bucket e listFiles(): FileObject[];

- Crie a classe **FileObjectService** com os métodos send(object: FileObject, bucket: Bucket), get(key: String, bucket: Bucket), update(key: String, bucket: Bucket, file: FileObject) e delete(key: String, bucket: Bucket);

- Implementar um supplier para o listFiles no BucketService;

- Utilize o [**Google Cloud Client for Java**](https://github.com/googleapis/google-cloud-java/tree/master/google-cloud-clients/google-cloud-storage) para fazer requisições ao Google Cloud Storage. [Documentação referente](https://cloud.google.com/storage/docs/reference/libraries#client-libraries-install-java);

- Utilize o [**AWS SDK Java**](https://github.com/aws/aws-sdk-java) para fazer requisições para o Amazon S3. [Documentação referente](https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/examples-s3.html);

- Crie a interface **Bucket** com os atributos: name, location;

- Crie a interface **FileObject** com os atributos: key, versionId, value, metadata, size;

- Utilize o padrão de projeto Factory na criação da interface **FactoryBucket**;

- Utilize o padrão de projeto Factory na criação da interface **FactoryFileObject**;

- Crie os packages google e amazon para inserir neles as classes que vão implementar as interfaces de Bucket, FileObject, FactoryBucket e FactoryFileObject;

- Utilize o [**GSON**](https://github.com/google/gson) para serializar objetos JSON para enviar aos serviços de armazenamento;

- Utilize o **Log4j** para registrar todos os logs relevantes da aplicação.
