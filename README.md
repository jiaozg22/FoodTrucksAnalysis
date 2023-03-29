#数据分析系统
## 1.开发环境
### 1.1 jdk 1.8 [安装，并配置好环境变量]
### 1.2 maven: apache-maven-3.6.3 [安装，并配置好环境变量]
### 1.3 git version 2.39.1 [安装，并集成idea]
### 1.4 idea 2020 [安装，并配置好环境变量]
### 1.5 网络：可联网下载私有库；可顺畅访问GitHub，如果网络不佳可多次尝试；或者先下载后使用

------
## 2.环境配置
<font color="#dd0000">2.1 保证开发环境搭建成功 </font><br />
<font color="#dd0000">2.2 复制本项目中的/document/setting.xml 文件到本地，覆盖maven文件 </font><br /> 
<font color="#dd0000">2.3 设置GitHub邮箱和开发账号 
                           git config --global user.email "xxx@163.com"
                           git config --global user.name "xxx"   </font><br /> 
<font color="#dd0000">2.4 下载代码前，设置 token： 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
  </font><br /> 
------
## 3.启动项目.。
<font color="#dd0000">3.1 新建项目，file->new -->project from version control -->输入url地址 -->使用https://github.com/jiaozg22/FoodTrucksAnalysis.git下载项目 </font><br />
<font color="#dd0000">2.2 下载项目过程中，需要设置token，token值 请参考2.4配置</font><br /> 
<font color="#dd0000">2.3 项目拉取成功以后，file->| Settings | Build, Execution, Deployment | Build Tools | Maven,idea配置maven</font><br /> 
<font color="#dd0000">2.4 项目拉取成功以后，执行maven import，刷新项目 </font><br /> 
<font color="#dd0000">2.5 执行maven clean compile install package ,编译打包项目 </font><br /> 
<font color="#dd0000">2.6 选择勾选env_pro ,选择 run 按钮，启动项目 </font><br /> 

