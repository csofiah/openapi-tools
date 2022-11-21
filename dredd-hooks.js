var hooks = require('hooks');

hooks.before('/communities/{communityId} > PUT > 201 > application/json', (transaction) => {
  transaction.skip = true;
});
hooks.before('/provinces/{provinceId} > PUT > 201 > application/json', (transaction) => {
  transaction.skip = true;
});
