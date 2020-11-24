<template>
  <div id="app">
    <Header/>
    <Content/>
  </div>
</template>

<script>
import Header from "./components/header";
import Content from "./components/content";
export default {
  name: 'App',
  components: {
    Header,
    Content
  }
}
</script>

<style>
#app {
  margin: 0;
  padding: 0;
}
</style>
