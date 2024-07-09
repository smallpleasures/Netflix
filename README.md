# Netflix
## Eureka
### 核心特性
#### 服务注册
- Eureka Client在第一次心跳时向Eureka Server注册
- 注册时会提供诸多自身元数据:主机名、端口、健康指标URL等
#### 服务续约
- Eureka Client通过发送心跳进行续约
- 默认情况下每30秒发送一次心跳
- 如9O秒内Eureka Server未收到续约，则进行服务剔除
#### 服务下线
- Eureka Client优雅退出时会发送cancel命令
- Eureka Server收到cancel命令时会删除该节点
#### 获取注册列表信息
- Eureka Client会缓存由Server获取的注册表信息
- Eureka Client会定期更新注册表信息[默认30秒]
- Eureka Client会处理注册表的合并等内容

