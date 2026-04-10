# GitHub Copilot vs Claude Code 对比

## 简介

| 工具 | 提供商 | 发布时间 | 定位 |
|------|--------|----------|------|
| **GitHub Copilot** | Microsoft / GitHub | 2021年（公测），2022年（正式） | IDE 内嵌 AI 编程助手 |
| **Claude Code** | Anthropic | 2025年 | 终端驱动的 Agentic AI 编程助手 |

---

## 核心功能对比

### GitHub Copilot

- **代码补全**：在编辑器中实时给出行级、块级代码建议
- **内联聊天（Inline Chat）**：直接在代码中对话、解释、重构
- **Copilot Chat**：侧边栏对话，支持解释代码、生成测试、排查 Bug
- **多文件编辑（Copilot Edits）**：跨文件的 AI 驱动修改（Copilot Agent 模式）
- **PR 描述生成**：自动生成 Pull Request 说明
- **代码审查建议**：提供 review 意见
- **集成方式**：VS Code、JetBrains IDE、Visual Studio、Neovim 等插件

### Claude Code

- **终端原生**：在命令行中运行，无需打开 IDE
- **Agentic 能力**：自主执行多步骤任务（读写文件、执行命令、调用工具）
- **全项目理解**：可以读取整个代码库的上下文（通过 `CLAUDE.md` 配置）
- **Git 集成**：可自主 `git add` / `git commit` / 创建 PR
- **MCP（Model Context Protocol）**：通过扩展插件连接外部工具和数据源
- **并行子 Agent**：拆解复杂任务，并发执行多个子任务
- **集成方式**：CLI（`claude` 命令），也可嵌入 VS Code（扩展）

---

## 使用场景对比

| 场景 | GitHub Copilot | Claude Code |
|------|----------------|-------------|
| 写代码时实时补全 | ✅ 非常擅长 | ⬜ 不是主要场景 |
| 解释某段代码 | ✅ 支持 | ✅ 支持 |
| 重构指定文件 | ✅ 支持 | ✅ 支持 |
| 跨多个文件的大范围修改 | 🟡 有限（Agent 模式） | ✅ 非常擅长 |
| 自主执行 Shell 命令 | ❌ 不支持 | ✅ 支持 |
| 自主提交代码 / 创建 PR | ❌ 不支持 | ✅ 支持 |
| 读取整个项目上下文 | 🟡 有限 | ✅ 可配置全量读取 |
| 调试 / 运行测试 | ❌ 不执行 | ✅ 可直接运行 |
| 集成到 CI/CD 流水线 | 🟡 有限 | ✅ 适合自动化流程 |
| IDE 深度集成 | ✅ 非常好 | 🟡 较弱（主要靠终端） |

---

## 上下文长度与理解能力

| 特性 | GitHub Copilot | Claude Code |
|------|----------------|-------------|
| 底层模型 | GPT-4o / Claude 3.5（可选） | Claude Sonnet 4 / Opus 4 |
| 上下文窗口 | 受 IDE 插件限制，通常较小 | 200K tokens（Claude 3.5+） |
| 项目级理解 | 较弱，主要基于当前文件 | 强，可扫描整个代码库 |

---

## 价格对比（2025年）

| 计划 | GitHub Copilot | Claude Code |
|------|----------------|-------------|
| 免费版 | ✅ 有（有限额度） | ❌ 无免费版 |
| 个人版 | $10/月 | 按 API Token 用量计费 |
| 企业版 | $19/用户/月 | 企业合同定价 |
| 备注 | 包含 Copilot Chat、PR 生成等 | 成本与使用量正相关，重度使用费用较高 |

---

## 优缺点总结

### GitHub Copilot

**优点：**
- IDE 深度集成，无需切换工作环境
- 实时补全体验流畅，延迟低
- 价格固定，适合个人和团队预算规划
- 生态成熟，支持多种 IDE

**缺点：**
- Agentic 能力相对弱，难以自主完成复杂多步骤任务
- 对整个项目的理解能力有限
- 无法自主执行命令或操作文件系统

---

### Claude Code

**优点：**
- 强大的 Agentic 能力，可自主完成复杂任务
- 理解整个代码库，上下文窗口大
- 可执行 Shell 命令、运行测试、提交代码
- 适合自动化开发工作流和 CI/CD 集成

**缺点：**
- 不适合日常实时代码补全
- 按用量计费，重度使用成本较高
- 主要是终端交互，学习曲线略高
- IDE 集成体验不如 Copilot 原生

---

## 如何选择？

- **日常编码 + IDE 内补全**：选 **GitHub Copilot**
- **复杂任务自动化 + 大范围代码修改**：选 **Claude Code**
- **两者结合**：Copilot 负责实时补全，Claude Code 处理大型重构或自动化任务

---

## 参考资料

- [GitHub Copilot 官方文档](https://docs.github.com/en/copilot)
- [Claude Code 官方文档](https://docs.anthropic.com/en/docs/claude-code)
- [Anthropic Claude 模型介绍](https://www.anthropic.com/claude)
