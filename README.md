# JDK1.8-source-analysis
This is a JDK1.8 source code analysis project.

# 项目介绍
本项目主要整理/记录阅读JDK源码时的理解与体会，仅供参考。

# Commit图例
| 序号  | emoji | 在本项目中的含义                        | 简写标记               |
|:-----:|:-------:|:---------------------------------:|:--------------------:|
| (0) | 🎉    | 初始化项目                           | :tada:             |
| (1) | 📝    | 更新文档，包括但不限于README               | :memo:             |
| (2) | 💡    | 发布新的阅读笔记 (注1)                   | :bulb:             |
| (3) | ✨     | 增量更新阅读笔记                        | :sparkles:         |
| (4) | ♻️    | 重构，主要指修改已有的阅读笔记，极少情形下会修改源码 (注2) | :recycle:          |
| (5) | ✏️    | 校对，主要指更正错别字、调整源码分组、修改源码排版等      | :pencil2:          |
| (6) | ✅     | 发布测试文件                          | :white_check_mark: |

> 注1：

> 关于某个源码当前的阅读进度，请参考已阅代码清单_按功能排序。

> 注2：涉及到修改源码的场景，包括但不限于：

> 修改无意义的变量名为更易懂的变量名；
> 补全控制语句作用域上的花括号；
> 重构控制语句结构(如if语句的拆分，for/while的互换)；
> for循环和foreach循环的转换；
> 拆分过长且难读的调用链，将中间过程单独摘出来；
> 提取频繁出现的某段操作为单个方法；
> 将一个文件内的多个顶级类拆分到不同的文件中(内部类不拆分)；
> 匿名类与非匿名类的转换；
> 匿名类与函数表达式的转换；
> 函数式调用与普通调用的转换；

> 修改的原则是：尽量少地修改，且不改变原有的代码逻辑与运行结果（涉及到多线程的代码有些迷）
> 修改的目的是：增强可读性，以及便于插入笔记

# 脚注
Commit信息中的emoji参考来源：
* [Full Emoji List](https://unicode.org/emoji/charts/full-emoji-list.html)
* [gitmoji](https://gitmoji.dev/)

# 附录
* [已阅代码清单_按功能排序](https://github.com/aserendipper/JDK1.8-source-analysis/blob/main/%E5%B7%B2%E9%98%85%E4%BB%A3%E7%A0%81%E6%B8%85%E5%8D%95_%E6%8C%89%E5%8A%9F%E8%83%BD%E6%8E%92%E5%BA%8F.md)
* [已阅代码清单_按名称排序](https://github.com/aserendipper/JDK1.8-source-analysis/blob/main/%E5%B7%B2%E9%98%85%E4%BB%A3%E7%A0%81%E6%B8%85%E5%8D%95_%E6%8C%89%E5%90%8D%E7%A7%B0%E6%8E%92%E5%BA%8F.md)
* [测试文件清单](https://github.com/aserendipper/JDK1.8-source-analysis/blob/main/%E6%B5%8B%E8%AF%95%E6%96%87%E4%BB%B6%E6%B8%85%E5%8D%95.md)
