/**
 * 本class存放了js的工具集(基于jQuery)
*/
export default class Util {
  /**
   * 将数组的值添加到标签的innerHTML
   * 
   * @param {string} head 标签开始
   * @param {string} foot 标签结束
   * @param {Array<string>} arr 被添加的数组
   * 
   * @returns {string} 返回拼接后的 HTML 字符串。
   * 
    *@example
    *  // 使用示例
    * const result = stringCom('<p>', '</p>', ['item1', 'item2', 'item3']);
    * console.log(result); 
    * // 输出: <p>item1</p><p>item2</p><p>item3</p>
    */
  stringCom(head, foot, arr) {
    let sc = "";
    for (let i = 0; i < arr.length; i++) {
      sc += head + arr[i] + foot;
    }
    return sc;
  }

    /**
   * 将数组的值添加到标签的innerHTML
   * 
   * @param {string} outTag 外标签
   * @param {string} inTag 内标签
   * @param {Array<string>} objecs 被添加的对象数组
   * 
   * @returns {string} 返回拼接后的 HTML 字符串。
   * 
    *@example
    *  // 使用示例
    * const result = stringCom('<p>', '</p>', ['item1', 'item2', 'item3']);
    * console.log(result); 
    * // 输出: <p>item1</p><p>item2</p><p>item3</p>
    */
    stringCom2(outTag, inTag, objecs) {
      let sc = "";
      for(let i = 0; i<objecs.length; i++) {
        sc += `<${outTag}>`;
        let keys = Object.keys(objecs[i]);
        for(let j = 0; j<keys.length; j++) {
          
            if($("#"+keys[j]).length!=0) {
              sc += `<${inTag} id="${keys[j]}">`;
              sc += objecs[i][keys[j]];
              sc += `</${inTag}>`;
            }
        }
        sc += `</${outTag}>`;
     
      }
      return sc;
    }
  

  
}