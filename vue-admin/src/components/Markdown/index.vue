<!--
Markdown 显示组件，传入content 作为prop 参数
使用 GitHub 风格
@author Hoody
-->

<template>
  <div class="markdown-body" v-html="htmlContent" />
</template>

<script>
import { getMD2HtmlClean } from '../../utils/markdown'; 'github-markdown-css'
export default {
  name: 'Markdown',
  props: ['content'],
  data() {
    return {
      htmlContent: ''
    }
  },
  watch: {
    content(newVal, oldVal) {
      this.htmlContent = getMD2HtmlClean(this.$props.content)
    }
  },
  methods: {
  }

}
</script>

<style scoped>
  .markdown-body {
    box-sizing: border-box;
    min-width: 200px;
    max-width: 980px;
    margin: 0 auto;
    padding: 45px;
  }

  @media (max-width: 767px) {
    .markdown-body {
      padding: 15px;
    }
  }
</style>
