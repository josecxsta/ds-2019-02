## Descrição do módulo
API para acesso a serviços de armazenamento (_storage_) oferecidos pela Google (Google Cloud Storage) e Amazon (S3). 
O acesso aos serviços devem ser unificados em uma única API, ou seja, independente de qual serviço é utilizado. Doravante estes 
serviços são abstratamente aqui referenciados como serviço A e serviço B.

## Requisitos

- R1 A identificação do serviço a ser utilizado, seja A ou B, é decidido apenas em tempo de execução.
- R2 Um mesmo cliente pode fazer uso dos serviços A e B simultaneamente, por exemplo, para copiar arquivos de A para B.
- R3 Um mesmo cliente em um dado instante pode usar o serviço A e, em outro instante, optar pelo uso do serviço B, ou seja,
não é necessário usar o mesmo serviço indefinidamente após feita sua opção. 
- R4 Deve ser possível persitir um arquivo F. 
- R5 Deve ser possível recuperar o conteúdo do arquivo F.
- R6 Deve ser possível Remover o arquivo F. 
- R7 Deve ser possível atualizar o conteúdo do arquivo F.


## Notas

- Deve ser feita avaliação dos serviços para verificar a possibilidade de implementação dos requisitos (ainda em definição).
Sem esta análise não há como definir a API a ser empregada pelo cliente. 
