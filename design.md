## Conceitos fundamentais

### Bucket

**Buckets** são os discos que armazenam dados. Cada intervalo deve possuir um nome global exclusivo em seu serviço de armazenamento.

### FileObject

**FileObjects** são os dados individuais que podem ser armazenados nos Buckets. Os FileObjects têm dois componentes: dados e metadados. Os dados geralmente são um arquivo que você quer armazenar no Bucket. Metadados são uma coleção de pares de nome-valor que descrevem várias qualidades do FileObject.


## Design detalhado do projeto

- Crie a interface **StorageService**.

- Crie classes **GoogleStorageService** e **AmazonStorageService** que implementam a interface StorageService;

- (!) Crie classe StorageCredential que armazenará a chave ou token da conta de serviço do serviço de armazenamento, além do host para requisições;

- Crie a interface **BucketService** com os métodos getAll(), get(), delete(), create() e listFiles().

- Crie a classe **FileObjectService** com os métodos  send(), get(), update() e delete();

- Utilize o **Google Cloud Client for Java** para fazer requisições ao Google Cloud Storage (https://github.com/googleapis/google-cloud-java/tree/master/google-cloud-clients/google-cloud-storage);

- Crie a classe **UnifiedApi** que terá os métodos bucket(), que instanciará BucketService; fileObject(), que instanciará FileObject. Essa classe deverá ter um construtor que recebe as credenciais para o acesso ao serviço de armazenamento.
Exemplo: 

```
UnifiedApi uApi = new UnifiedApi(credentials);
ArrayList<Bucket> buckets = uApi.bucket().getAll();
 ```

- (?) Crie a interface **Bucket** com os atributos: name.

- (?) Crie a interface **FileObject** com os atributos:.

- Utilize o padrão de projeto Factory na criação da interface **FactoryBucket**

- Utilize o padrão de projeto Factory na criação da interface **FactoryFileObject** 

- Crie os packages google e amazon para inserir neles as classes que vão implementar as interfaces de Bucket, FileObject, FactoryBucket e FactoryFileObject.

- Utilize o **AWS SDK Java** para fazer requisições para o Amazon S3 (https://github.com/aws/aws-sdk-java);

- Utilize o **GSON** para serializar objetos JSON para enviar aos serviços de armazenamento (https://github.com/google/gson);

- Utilize o **Log4j** para registrar todos os logs relevantes da aplicação;
