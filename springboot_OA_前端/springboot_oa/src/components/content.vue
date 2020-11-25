<template>
    <div class="content">
        <SelectList @chooseIndex="handleChoose"/>
        <label v-if="this.cIndex==1">
            <Notice/>
        </label>
        <label v-if="this.cIndex==2">
            <Leave/>
        </label>
        <label v-if="this.cIndex==3">
            <Salary/>
        </label>
    </div>
</template>

<script>
import SelectList from "./SelectList";
import Notice from "./Notice";
import Leave from "./Leave";
import Salary from "./Salary";
export default {
    components: {
        SelectList,
        Notice,
        Leave,
        Salary 
    },
    data(){
        return{
            cIndex: 1 
        }
    },
    methods: {
        handleChoose(index){
            this.cIndex = index;
        }
    }
}
</script>

<style scoped>
.content{
    position: relative;
    width: 100%;
}
</style>