# 项目介绍
这是一个基于Java SpringBoot框架构建的宿舍零食售卖系统，管理员可以维护合伙成员信息、创建商品选项、订单处理及销售数据可视化和统计；学生可以浏览上架商品、下单和定制零食组合等。

# 零食商品售卖系统——功能测试用例

  * 管理端
    * 员工管理接口
      * 员工登录
        * 正常情况
          * 测试内容：输入正确用户名和正确密码登录
          * 预期结果：登录成功，进入管理界面

        * 账号不存在
          * 测试内容：输入不存在的用户名登录
          * 预期结果：提示 “账号不存在”

        * 密码错误
          * 测试内容：输入正确用户名和错误密码登录
          * 预期结果：提示 “密码错误”

      * 员工注册
        * 信息完整且合法
          * 测试内容：填写员工信息完整且合法信息注册
          * 预期结果：注册成功，添加到员工列表，发送通知邮件

        * 账号已存在
          * 测试内容：输入已存在的账号注册
          * 预期结果：提示 “账号已存在”

        * 信息不完整 / 不合法
          * 测试内容：填写不完整或不合法信息注册
          * 预期结果：提示错误信息

      * 员工信息查询
        * 按账号查询
          * 测试内容：输入员工账号查询
          * 预期结果：查询到对应员工信息，记录查询日志

        * 按姓名查询
          * 测试内容：输入员工姓名查询
          * 预期结果：查询到含该姓名的所有员工，记录查询日志

        * 无查询结果
          * 测试内容：输入不存在的条件查询
          * 预期结果：提示 “未找到符合条件的员工”，记录查询日志

      * 员工信息修改
        * 权限验证通过
          * 测试内容：有权限用户修改员工信息并保存
          * 预期结果：更新数据库，记录修改日志

        * 权限验证不通过
          * 测试内容：无权限用户尝试修改员工信息
          * 预期结果：提示 “无权限操作”，不修改，记录非法日志

        * 修改信息为空
          * 测试内容：修改员工信息时清空必填项
          * 预期结果：提示 “必填项不能为空”，不进行修改

      * 员工删除
        * 正常删除
          * 测试内容：选择员工，确认删除
          * 预期结果：员工信息从数据库删除，记录删除日志

        * 删除已离职员工
          * 测试内容：对已离职员工执行删除操作
          * 预期结果：提示 “已离职，无法删除”，不删除

        * 删除关联订单员工
          * 测试内容：存在未完成订单的员工，执行删除操作
          * 预期结果：提示 “存在未完成订单，无法删除”

    * 分类管理接口
      * 分类添加
        * 测试内容：填写完整且不重复的分类信息添加
        * 预期结果：分类添加成功，记录添加日志

      * 分类查询
        * 测试内容：通过 ID、名称等条件查询分类
        * 预期结果：准确查询并显示分类信息，记录查询日志；无结果时提示 “未找到”

      * 分类修改
        * 测试内容：有权限用户修改分类信息并保存
          * 预期结果：更新分类信息，记录修改日志

        * 测试内容：无权限用户尝试修改分类信息
          * 预期结果：提示 “无权限操作”，不修改，记录非法日志

        * 测试内容：修改分类信息时清空必填项
          * 预期结果：提示 “必填项不能为空”，不修改

      * 分类删除
        * 测试内容：选择分类，确认删除
          * 预期结果：分类从数据库删除，更新相关零食商品信息，记录删除日志

        * 测试内容：对存在零食商品的分类执行删除操作
          * 预期结果：提示 “存在零食商品，无法删除”，不删除

    * 零食商品管理接口
      * 零食商品添加
        * 测试内容：填写完整且不重复的零食商品信息添加
        * 预期结果：零食商品添加成功，记录添加日志

      * 零食商品查询
        * 测试内容：通过 ID、名称、分类等条件查询零食商品
        * 预期结果：准确查询并显示零食商品信息，记录查询日志；无结果时提示 “未找到”

      * 零食商品修改
        * 测试内容：有权限用户修改零食商品信息并保存
          * 预期结果：更新零食商品信息，记录修改日志

        * 测试内容：无权限用户尝试修改零食商品信息
          * 预期结果：提示 “无权限操作”，不修改，记录非法日志

        * 测试内容：修改零食商品信息时清空必填项
          * 预期结果：提示 “必填项不能为空”，不修改

      * 零食商品删除
        * 测试内容：选择零食商品，确认删除
          * 预期结果：零食商品从数据库删除，更新相关订单信息，记录删除日志

        * 测试内容：对已关联套餐的零食商品执行删除操作
          * 预期结果：提示 “已关联套餐，无法直接删除”，不删除

    * 零食商品组合管理接口
      * 零食商品组合添加
        * 测试内容：填写完整且不重复的零食商品组合信息添加
        * 预期结果：零食商品组合添加成功，记录添加日志

      * 零食商品组合查询
        * 测试内容：通过 ID、名称等条件查询零食商品组合
        * 预期结果：准确查询并显示零食商品组合信息，记录查询日志；无结果时提示 “未找到”

      * 零食商品组合修改
        * 测试内容：有权限用户修改零食商品组合信息并保存
          * 预期结果：更新零食商品组合信息，记录修改日志

        * 测试内容：无权限用户尝试修改零食商品组合信息
          * 预期结果：提示 “无权限操作”，不修改，记录非法日志

        * 测试内容：修改零食商品组合信息时清空必填项
          * 预期结果：提示 “必填项不能为空”，不修改

      * 零食商品组合删除
        * 测试内容：选择零食商品组合，确认删除
          * 预期结果：零食商品组合从数据库删除，更新相关订单信息，记录删除日志

        * 测试内容：对已关联订单的零食商品组合执行删除操作
          * 预期结果：提示 “已关联订单，无法删除”，不删除

    * 订单管理接口
      * 订单查询
        * 测试内容：通过订单号、用户账号等条件查询订单
        * 预期结果：准确查询并显示订单详情，记录查询日志；无结果时提示 “未找到”

      * 订单修改
        * 测试内容：有权限用户修改订单状态、备注等并保存
          * 预期结果：更新订单信息，记录修改日志，推送状态变更通知

        * 测试内容：无权限用户尝试修改订单信息
          * 预期结果：提示 “无权限操作”，不修改，记录非法日志

        * 测试内容：不符合流程的状态变更操作
          * 预期结果：提示 “状态变更不符合流程”，不修改

      * 订单删除
        * 测试内容：选择订单，确认删除
          * 预期结果：订单从数据库删除，记录删除日志

        * 测试内容：对已发货或已完成的订单执行删除操作
          * 预期结果：根据业务规则处理，或提示 “无法直接删除”

        * 测试内容：对已关联其他业务的订单执行删除操作
          * 预期结果：提示 “关联其他业务，无法直接删除”

    * 工作台接口
      * 订单状态统计
        * 测试内容：统计不同状态的订单数量
          * 预期结果：正确统计并以图表展示，记录统计日志；数据异常时提示 “数据异常”

      * 销售数据统计
        * 测试内容：按日、月、自定义时间段统计销售数据
          * 预期结果：正确统计并以图表展示，记录统计日志

      * 热门零食商品统计
        * 测试内容：统计热门零食商品
          * 预期结果：正确统计并展示，记录统计日志；数据不足时提示 “数据不足”

      * 待处理事务提醒
        * 测试内容：提醒待付款订单等事务
          * 预期结果：在工作台醒目提醒，可查看具体信息

    * 数据统计接口
      * 销售数据统计
        * 测试内容：生成日、月、自定义时间段销售报表
          * 预期结果：报表内容正确，以指定格式保存，记录生成日志，发送给相关人员

      * 用户数据统计
        * 测试内容：统计日活跃用户等数据
          * 预期结果：正确统计并以图表展示，记录统计日志

      * 零食商品数据统计
        * 测试内容：统计零食商品销量、评价数据
          * 预期结果：生成销量排行榜等，记录统计日志

      * 报表导出
        * 测试内容：选择报表类型和时间范围导出
          * 预期结果：正确导出报表，记录导出日志；失败时提示 “导出失败”

    * 来单提醒接口
      * 新订单提醒
        * 测试内容：有新订单生成
          * 预期结果：5 秒内提醒管理员，记录发送日志；延迟不超过 30 秒

      * 订单状态变更提醒
        * 测试内容：订单状态变更
          * 预期结果：及时提醒管理员，记录发送日志，支持多种提醒方式

  * 用户端
    * 微信登录接口
      * 正常登录
        * 测试内容：通过微信授权登录
          * 预期结果：登录成功，进入首页，记录日志

      * 取消授权
        * 测试内容：微信授权登录时取消授权
          * 预期结果：提示 “登录取消”，不创建账号，记录日志

      * 账号已存在
        * 测试内容：微信账号已绑定其他账号时登录
          * 预期结果：提示 “账号已绑定”，可解绑或切换账号

    * 零食商品浏览接口
      * 分类浏览
        * 测试内容：查看分类列表，点击分类查看零食商品
          * 预期结果：显示分类及对应零食商品，加载速度正常

      * 搜索了一览
        * 测试内容：输入零食商品关键词搜索
          * 预期结果：显示搜索结果，无结果时提示 “未找到”，提供联想词

      * 零食商品详情查看
        * 测试内容：点击零食商品查看详情
          * 预期结果：详情页加载正常，显示评价等内容

    * 零食购物车接口
      * 添加零食商品到购物车
        * 测试内容：选择零食商品规格和数量，点击 “加入购物车”
          * 预期结果：添加成功，更新零食购物车信息，记录日志；库存不足时提示 “库存不足”；零食商品已下架时提示 “零食商品已下架”

      * 零食购物车商品查询
        * 测试内容：进入零食购物车页面
          * 预期结果：显示已添加零食商品，购物车为空时提示 “购物车为空”

      * 零食购物车商品修改
        * 测试内容：修改零食商品数量、规格
          * 预期结果：数量在库存内更新成功；超出库存提示 “库存不足”；规格有库存更新成功，无库存提示 “规格无库存”

      * 零食购物车商品删除
        * 测试内容：选择零食商品，点击 “删除” 或 “批量删除”
          * 预期结果：零食商品从购物车移除，更新购物车信息，记录日志

    * 用户下单接口
      * 提交订单
        * 测试内容：填写完整收货信息，确认下单
          * 预期结果：订单提交成功，状态为 “待付款”，记录日志，生成订单号，发送通知

        * 测试内容：信息不完整或不合法时下单
          * 预期结果：提示错误信息，不提交订单

        * 测试内容：提交订单时部分零食商品库存不足
          * 预期结果：提示 “库存不足”，不提交订单

      * 订单支付
        * 测试内容：选择微信支付，点击 “立即支付”
          * 预期结果：跳转支付页面，支付成功后订单状态更新，记录日志，发送支付成功通知，管理员收到新订单提醒；支付失败提示 “支付失败”，记录失败日志；超时订单取消，记录超时日志，释放库存，发送取消通知

    * 微信支付接口
      * 正常支付
        * 测试内容：确认支付金额无误，点击 “确认支付”
          * 预期结果：支付成功，更新订单状态，记录日志

      * 支付失败
        * 测试内容：因网络等问题支付
          * 预期结果：提示 “支付失败，原因：XXX”，记录失败日志，提供重试选项

      * 支付结果通知
        * 测试内容：完成支付
          * 预期结果：发送支付结果通知，记录发送日志

    * 历史订单接口
      * 订单查询
        * 测试内容：进入历史订单页面，筛选查询
          * 预期结果：显示历史订单列表，支持分页；筛选后显示符合条件订单

      * 订单详情查看
        * 测试内容：点击订单查看详情
          * 预期结果：显示订单详细信息

      * 订单取消
        * 测试内容：对不同状态订单申请取消
          * 预期结果：待付款、待发货订单申请成功，审核通过后状态更新；其他状态订单提示 “无法取消”

    * 地址管理接口
      * 地址添加
        * 测试内容：填写完整收货地址信息，点击 “保存”
          * 预期结果：地址添加成功，记录日志，可设为默认；信息不完整提示错误信息

      * 地址查询
        * 测试内容：进入地址管理页面
          * 预期结果：显示已保存地址列表

      * 地址修改
        * 测试内容：编辑地址后保存
          * 预期结果：地址信息更新成功，记录日志；信息不合法提示错误信息

      * 地址删除
        * 测试内容：选择地址，点击 “删除”
          * 预期结果：地址从列表移除，记录日志；删除默认地址时自动更新默认地址

      * 设置默认地址
        * 测试内容：点击非默认地址的 “设为默认” 按钮
          * 预期结果：设置成功，记录日志，原默认地址取消默认状态

    * 用户催单接口
      * 正常催单
        * 测试内容：在待发货或待收货订单点击 “催单”
          * 预期结果：发送催单通知，记录日志，提示 “催单成功”

      * 重复催单限制
        * 测试内容：在规定时间内重复催单
          * 预期结果：提示 “已催单，请等待”，不重复通知

      * 订单状态不符催单条件
        * 测试内容：对已完成、已取消订单催单
          * 预期结果：提示 “订单状态无法催单”
         
            
# 零食商品售卖系统-非功能测试用例

* 界面测试
  * 界面美观、布局合理、符合原型设计
  * 内容能够正常显示
  * 字体大小等符合要求
* 易用性测试
  * 操作按钮、输入框等元素是否易识别、易操作
  * 操作流程是否清晰
  * 操作错误时是否有提示
* 兼容性测试
  * 在不同浏览器上能够正常运行、界面正常显示，如谷歌，edge，火狐等
  * 在不同操作系统上能够正常运行、界面正常显示，如 Windows，Linux，MacOS等
  * 在不同设备上能够正常运行、界面正常显示，如不同分辨率、系统版本的移动设备
* 性能测试
  * 响应时间：页面访问加载速度、服务器响应时长
  * 资源消耗：功能运行时cpu、内存等资源的占用情况
  * 高并发访问
* 安全测试
  * 接口传输数据时是否加密
  * 输入数据时能否防止 SQL 注入
  * 能否抵御伪造请求的攻击
    ![零食商品售卖系统-功能测试用例](https://github.com/user-attachments/assets/d67f9746-c8e9-4ea3-bc06-4a05b201102e)
![零食商品售卖系统-非功能测试用例](https://github.com/user-attachments/assets/5562a1ad-3ccc-499e-84b8-683af749208a)
