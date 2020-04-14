## POM FILE README
1. parent：定义spring boot的版本
2. dependencyManagement：spring cloud的版本以及spring cloud alibaba的版本，由于spring cloud alibaba还未纳入spring cloud的主版本管理中，所以需要自己加入
3. dependencies：当前应用要使用的依赖内容。这里主要新加入了Nacos的服务注册与发现模块：spring-cloud-starter-alibaba-nacos-discovery。由于在dependencyManagement中已经引入了版本，所以这里就不用指定具体版本了